/*
 * Copyright (C) 2021 <https://github.com/burakhayirli>
 * @author BURAKHAYIRLI
 * Yaz�l�m Geli�tirici Yeti�tirme Kamp� (JAVA + REACT)
 * 3 May 2021
 */
package ders4Odev3_GameManagementSystem.Concrete;

import ders4Odev3_GameManagementSystem.Abstract.PlayerCheckService;
import ders4Odev3_GameManagementSystem.Abstract.PlayerService;
import ders4Odev3_GameManagementSystem.Entities.Player;

public class PlayerManager implements PlayerService {

	PlayerCheckService playerCheckService;
	
	public PlayerManager(PlayerCheckService playerCheckService) {
		super();
		this.playerCheckService = playerCheckService;
	}

	@Override
	public void add(Player player) {
		if (playerCheckService.CheckIfRealPerson(player)) {
			System.out.println("Yeni oyuncu eklendi : " + player.toString());
		} else {
			System.out.println("Ki�i bilgileri ge�erli de�il. Yeni oyuncu eklenemedi");
		}
	}

	@Override
	public void update(Player player) {
		System.out.println("Oyuncu g�ncellendi : " + player.toString());
	}

	@Override
	public void delete(Player player) {
		System.out.println("Oyuncu silindi : " + player.toString());
	}

}
