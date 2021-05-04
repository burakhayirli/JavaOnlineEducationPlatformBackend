/*
 * Copyright (C) 2021 <https://github.com/burakhayirli>
 * @author BURAKHAYIRLI
 * Yaz�l�m Geli�tirici Yeti�tirme Kamp� (JAVA + REACT)
 * 4 May 2021
 */
package ders4Odev3_GameManagementSystem.Concrete;

import ders4Odev3_GameManagementSystem.Abstract.CampaignService;
import ders4Odev3_GameManagementSystem.Entities.Campaign;

public class CampaignManager implements CampaignService {

	@Override
	public void add(Campaign entity) {
		System.out.println("Yeni kampanya eklendi: " + entity.toString());
	}

	@Override
	public void update(Campaign entity) {
		System.out.println("Kampanya g�ncellendi: " + entity.toString());
	}

	@Override
	public void delete(Campaign entity) {
		System.out.println("Kampanya silindi: " + entity.toString());
	}

}
