/*
 * Copyright (C) 2021 <https://github.com/burakhayirli>
 * @author BURAKHAYIRLI
 * Yazýlým Geliþtirici Yetiþtirme Kampý (JAVA + REACT)
 * 3 May 2021
 */
package ders4Odev2_musteriYonetimSistemi;

import java.sql.Date;

import ders4Odev2_musteriYonetimSistemi.Abstract.BaseCustomerManager;
import ders4Odev2_musteriYonetimSistemi.Adapters.MernisServiceAdapter;
import ders4Odev2_musteriYonetimSistemi.Concrete.NeroCustomerManager;
import ders4Odev2_musteriYonetimSistemi.Concrete.StarbucksCustomerManager;
import ders4Odev2_musteriYonetimSistemi.Entities.Customer;

public class Main {

	public static void main(String[] args) {
		BaseCustomerManager customerManager= new StarbucksCustomerManager(new MernisServiceAdapter());
		Customer customer = new Customer();
		customer.setFirstName("Burak");
		customer.setLastName("HAYIRLI");
		customer.setDateOfBirth(new Date(1984,1,1));
		customer.setNationalityId("1234567890");
		customerManager.save(customer);
	}

}
