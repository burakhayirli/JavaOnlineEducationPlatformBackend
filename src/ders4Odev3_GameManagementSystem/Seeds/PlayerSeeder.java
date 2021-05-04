/*
 * Copyright (C) 2021 <https://github.com/burakhayirli>
 * @author BURAKHAYIRLI
 * Yazýlým Geliþtirici Yetiþtirme Kampý (JAVA + REACT)
 * 4 May 2021
 */
package ders4Odev3_GameManagementSystem.Seeds;

import java.util.ArrayList;

import ders4Odev3_GameManagementSystem.Entities.Player;

public class PlayerSeeder implements Seeder{

	public ArrayList<Player> generatedList;
	public PlayerSeeder() {
		generatedList=new ArrayList<Player>();
		
		Player player =new Player();
		player.setNationalityId("1234567890");
		player.setFirstName("Burak");
		player.setLastName("HAYIRLI");
		player.setDateOfBirth(1984);
		
		generatedList.add(player);		
	}
}
