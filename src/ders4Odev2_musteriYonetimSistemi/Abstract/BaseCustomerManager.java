/*
 * Copyright (C) 2021 <https://github.com/burakhayirli>
 * @author BURAKHAYIRLI
 * Yazýlým Geliþtirici Yetiþtirme Kampý (JAVA + REACT)
 * 3 May 2021
 */
package ders4Odev2_musteriYonetimSistemi.Abstract;

import ders4Odev2_musteriYonetimSistemi.Entities.Customer;

public abstract class BaseCustomerManager implements CustomerService {

	@Override
	public void save(Customer customer) {
		System.out.println("Veritabanýna kaydedildi : " + customer.toString());
	}

}
