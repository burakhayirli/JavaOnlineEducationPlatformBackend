/*
 * Copyright (C) 2021 <https://github.com/burakhayirli>
 * @author BURAKHAYIRLI
 * Yazýlým Geliþtirici Yetiþtirme Kampý (JAVA + REACT)
 * 3 May 2021
 */
package ders4Odev3_GameManagementSystem;

import ders4Odev3_GameManagementSystem.Adapters.MernisServiceAdapter;
import ders4Odev3_GameManagementSystem.Concrete.PlayerManager;
import ders4Odev3_GameManagementSystem.Entities.Player;

public class Main {

	public static void main(String[] args) {
		
		PlayerManager playerManager=new PlayerManager(new MernisServiceAdapter());
		
		Player player =new Player();
		player.setNationalityId("1234567890");
		player.setFirstName("Burak");
		player.setLastName("HAYIRLI");
		player.setDateOfBirth(1984);
		
		playerManager.add(player);
		playerManager.update(player);
		playerManager.delete(player);
		
		
		
	}

}
