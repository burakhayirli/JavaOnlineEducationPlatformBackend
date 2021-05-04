/*
 * Copyright (C) 2021 <https://github.com/burakhayirli>
 * @author BURAKHAYIRLI
 * Yaz�l�m Geli�tirici Yeti�tirme Kamp� (JAVA + REACT)
 * 4 May 2021
 */
package ders4Odev3_GameManagementSystem.Concrete;

import ders4Odev3_GameManagementSystem.Abstract.GameItemService;
import ders4Odev3_GameManagementSystem.Entities.GameItem;

public class GameItemManager implements GameItemService {

	@Override
	public void add(GameItem entity) {
		System.out.println("Yeni Oyun �temi Eklendi: " + entity.toString());
	}

	@Override
	public void update(GameItem entity) {
		System.out.println("Oyun �temi G�ncellendi: " + entity.toString());
	}

	@Override
	public void delete(GameItem entity) {
		System.out.println("Oyun �temi Silindi: " + entity.toString());
	}

}
