/*
 * Copyright (C) 2021 <https://github.com/burakhayirli>
 * @author BURAKHAYIRLI
 * Yazýlým Geliþtirici Yetiþtirme Kampý (JAVA + REACT)
 * 3 May 2021
 */
package ders4Odev2_musteriYonetimSistemi.Concrete;

import ders4Odev2_musteriYonetimSistemi.Abstract.BaseCustomerManager;
import ders4Odev2_musteriYonetimSistemi.Abstract.CustomerCheckService;
import ders4Odev2_musteriYonetimSistemi.Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {

	private CustomerCheckService customerCheckService;

	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		super();
		this.customerCheckService = customerCheckService;
	}

	@Override
	public void save(Customer customer) {
		if (customerCheckService.CheckIfRealPerson(customer)) {
			super.save(customer);
		} else {
			//new Exception("Not a valid person");
			System.out.println("Not a valid person.");
		}

	}

}
