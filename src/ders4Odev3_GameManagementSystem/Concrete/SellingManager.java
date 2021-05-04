/*
 * Copyright (C) 2021 <https://github.com/burakhayirli>
 * @author BURAKHAYIRLI
 * Yazýlým Geliþtirici Yetiþtirme Kampý (JAVA + REACT)
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
		System.out.println("Ýndirimli Satýþ Yapýldý: " + entity.getPlayer().getFirstName() + " isimli oyuncu "
				+ entity.getGameItem().getName() + " Ýtemini " + entity.getCampaign().getName() + " isimli kampanyayý \n"
				+ entity.getCampaign().getCode() + " kodunu kullanarak %" + entity.getCampaign().getDiscount()
				+ " oranýnda indirim ile " + entity.getDiscountedPrice() + " TL'ye satýn almýþtýr.");
		}else {
			System.out.println("Satýþ Yapýldý: " + entity.getPlayer().getFirstName() + " isimli oyuncu "
					+ entity.getGameItem().getName() +" itemini satýn almýþtýr.");
		}
	}

	@Override
	public void update(Selling entity) {
		System.out.println("Satýþ Güncellendi :" + entity.getPlayer().getFirstName() + " isimli oyuncu "
				+ entity.getGameItem().getName() + " Ýtemini " + entity.getCampaign().getName() + " isimli kampanyayý "
				+ entity.getCampaign().getCode() + " kodunu kullanarak %" + entity.getCampaign().getDiscount()
				+ " oranýnda indirim ile " + entity.getDiscountedPrice() + " TL'ye satýn almýþtýr.");
	}

	@Override
	public void delete(Selling entity) {
		System.out.println("Satýþ Silindi :" + entity.getPlayer().getFirstName() + " isimli oyuncu "
				+ entity.getGameItem().getName() + " Ýtemini " + entity.getCampaign().getName() + " isimli kampanyayý "
				+ entity.getCampaign().getCode() + " kodunu kullanarak %" + entity.getCampaign().getDiscount()
				+ " oranýnda indirim ile " + entity.getDiscountedPrice() + " TL'ye satýn almýþtýr.");
	}

}
