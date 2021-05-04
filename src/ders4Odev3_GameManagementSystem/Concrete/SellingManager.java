/*
 * Copyright (C) 2021 <https://github.com/burakhayirli>
 * @author BURAKHAYIRLI
 * Yaz�l�m Geli�tirici Yeti�tirme Kamp� (JAVA + REACT)
 * 4 May 2021
 */
package ders4Odev3_GameManagementSystem.Concrete;

import ders4Odev3_GameManagementSystem.Abstract.CampaignService;
import ders4Odev3_GameManagementSystem.Abstract.SellingService;
import ders4Odev3_GameManagementSystem.Entities.Selling;

public class SellingManager implements SellingService {

	public SellingManager() {
	}

	@Override
	public void add(Selling entity) {
		if(entity.getCampaign()!=null) {			
		System.out.println("�ndirimli Sat�� Yap�ld�: " + entity.getPlayer().getFirstName() + " isimli oyuncu "
				+ entity.getGameItem().getName() + " �temini " + entity.getCampaign().getName() + " isimli kampanyay� \n"
				+ entity.getCampaign().getCode() + " kodunu kullanarak %" + entity.getCampaign().getDiscount()
				+ " oran�nda indirim ile " + entity.getDiscountedPrice() + " TL'ye sat�n alm��t�r.");
		}else {
			System.out.println("Sat�� Yap�ld�: " + entity.getPlayer().getFirstName() + " isimli oyuncu "
					+ entity.getGameItem().getName() +" itemini sat�n alm��t�r.");
		}
	}

	@Override
	public void update(Selling entity) {
		System.out.println("Sat�� G�ncellendi :" + entity.getPlayer().getFirstName() + " isimli oyuncu "
				+ entity.getGameItem().getName() + " �temini " + entity.getCampaign().getName() + " isimli kampanyay� "
				+ entity.getCampaign().getCode() + " kodunu kullanarak %" + entity.getCampaign().getDiscount()
				+ " oran�nda indirim ile " + entity.getDiscountedPrice() + " TL'ye sat�n alm��t�r.");
	}

	@Override
	public void delete(Selling entity) {
		System.out.println("Sat�� Silindi :" + entity.getPlayer().getFirstName() + " isimli oyuncu "
				+ entity.getGameItem().getName() + " �temini " + entity.getCampaign().getName() + " isimli kampanyay� "
				+ entity.getCampaign().getCode() + " kodunu kullanarak %" + entity.getCampaign().getDiscount()
				+ " oran�nda indirim ile " + entity.getDiscountedPrice() + " TL'ye sat�n alm��t�r.");
	}

}
