/*
 * Copyright (C) 2021 <https://github.com/burakhayirli>
 * @author BURAKHAYIRLI
 * Yazýlým Geliþtirici Yetiþtirme Kampý (JAVA + REACT)
 * 4 May 2021
 */
package ders4Odev3_GameManagementSystem.Seeds;

import java.util.ArrayList;

import ders4Odev3_GameManagementSystem.Entities.Campaign;

public class CampaignSeeder implements Seeder {
	public ArrayList<Campaign> generatedList;

	public CampaignSeeder() {
		generatedList = new ArrayList<Campaign>();

		Campaign campaign = new Campaign();
		campaign.setId(1);
		campaign.setCode("19MAYIS");
		campaign.setName("19 Mayýs'a özel %19 indirim");
		campaign.setDiscount(19);

		generatedList.add(campaign);

		campaign = new Campaign();
		campaign.setId(1);
		campaign.setCode("23NÝSAN");
		campaign.setName("23 Nisan'a özel %23 indirim");
		campaign.setDiscount(23);

		generatedList.add(campaign);
	}
}
