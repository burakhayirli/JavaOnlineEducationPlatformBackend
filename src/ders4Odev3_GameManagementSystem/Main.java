/*
 * Copyright (C) 2021 <https://github.com/burakhayirli>
 * @author BURAKHAYIRLI
 * Yaz�l�m Geli�tirici Yeti�tirme Kamp� (JAVA + REACT)
 * 3 May 2021
 */
package ders4Odev3_GameManagementSystem;

import ders4Odev3_GameManagementSystem.Adapters.MernisServiceAdapter;
import ders4Odev3_GameManagementSystem.Concrete.GameItemManager;
import ders4Odev3_GameManagementSystem.Concrete.GameManager;
import ders4Odev3_GameManagementSystem.Concrete.PlayerManager;
import ders4Odev3_GameManagementSystem.Entities.Campaign;
import ders4Odev3_GameManagementSystem.Entities.GameItem;
import ders4Odev3_GameManagementSystem.Seeds.CampaignSeeder;
import ders4Odev3_GameManagementSystem.Seeds.GameItemSeeder;
import ders4Odev3_GameManagementSystem.Seeds.PlayerSeeder;

public class Main {

	public static void main(String[] args) {

		GameManager gameManager = new GameManager(new PlayerManager(new MernisServiceAdapter()), new GameItemManager());

		gameManager.registerPlayer(new PlayerSeeder().generatedList.get(0));
		gameManager.gameItemList = new GameItemSeeder().generatedList;
		gameManager.campaignList= new CampaignSeeder().generatedList;
		
		System.out.println("\n");
		
		System.out.println("Giri� yapm�� olan oyuncu bilgisi: " + gameManager.getActivePlayer().toString()+"\n");
		System.out.println("Sat�n al�nabilir toplam item say�s�: " + gameManager.gameItemList.size());
		
		for(GameItem gameItem:gameManager.gameItemList) {
			
			System.out.print(gameItem.getId()+"-"+gameItem.getName()+"("+gameItem.getPrice()+"TL)"+" | ");
		}
		System.out.println("\n");
		
		System.out.println("Ge�erli kampanya say�s�: "+ gameManager.campaignList.size());
		for(Campaign campaign:gameManager.campaignList) {
			
			System.out.println(campaign.toString());
		}

	}

}
