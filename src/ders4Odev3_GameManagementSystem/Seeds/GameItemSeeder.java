/*
 * Copyright (C) 2021 <https://github.com/burakhayirli>
 * @author BURAKHAYIRLI
 * Yazýlým Geliþtirici Yetiþtirme Kampý (JAVA + REACT)
 * 4 May 2021
 */
package ders4Odev3_GameManagementSystem.Seeds;

import java.util.ArrayList;

import ders4Odev3_GameManagementSystem.Entities.GameItem;
public class GameItemSeeder implements Seeder {
	public ArrayList<GameItem> generatedList;
	public GameItemSeeder() {
		generatedList=new ArrayList<GameItem>();
		
		GameItem gameItem=new GameItem();
		gameItem.setId(1);
		gameItem.setName("Balta");
		gameItem.setPrice(20);
		
		generatedList.add(gameItem);
		
		gameItem=new GameItem();
		gameItem.setId(2);
		gameItem.setName("Çekiç");
		gameItem.setPrice(10);
		
		generatedList.add(gameItem);
		
		gameItem=new GameItem();
		gameItem.setId(3);
		gameItem.setName("Kazma");
		gameItem.setPrice(15);
		
		generatedList.add(gameItem);
		
		gameItem=new GameItem();
		gameItem.setId(4);
		gameItem.setName("Asker");
		gameItem.setPrice(200);
		
		generatedList.add(gameItem);	
		
		gameItem=new GameItem();
		gameItem.setId(5);
		gameItem.setName("Aðaç");
		gameItem.setPrice(10);
		
		generatedList.add(gameItem);
		
		gameItem=new GameItem();
		gameItem.setId(6);
		gameItem.setName("Tuðla");
		gameItem.setPrice(16);
		
		generatedList.add(gameItem);
		
		System.out.println("Oyun itemleri yüklendi");
	}
}
