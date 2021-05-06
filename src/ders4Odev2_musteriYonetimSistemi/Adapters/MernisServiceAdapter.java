/*
 * Copyright (C) 2021 <https://github.com/burakhayirli>
 * @author BURAKHAYIRLI
 * Yazýlým Geliþtirici Yetiþtirme Kampý (JAVA + REACT)
 * 3 May 2021
 */
package ders4Odev2_musteriYonetimSistemi.Adapters;

import java.rmi.RemoteException;

import ders4Odev2_musteriYonetimSistemi.Abstract.CustomerCheckService;
import ders4Odev2_musteriYonetimSistemi.Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService {

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		// Gerçek service baðlan ve sorgulama yap. 
		//Ancak þimdilik Algoritma ile T.C. Kimlik No kontrol edelim.
		//return isTCKNCorrect(customer.getNationalityId());
		
		boolean isValidated=false;
	
		KPSPublicSoapProxy client=new KPSPublicSoapProxy();
		try {
			isValidated= client.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()), 
					customer.getFirstName(),customer.getLastName(), customer.getDateOfBirth().getYear());
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		}

		return isValidated;
	}
}
