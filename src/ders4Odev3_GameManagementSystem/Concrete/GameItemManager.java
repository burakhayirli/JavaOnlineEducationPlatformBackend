/*
 * Copyright (C) 2021 <https://github.com/burakhayirli>
 * @author BURAKHAYIRLI
 * Yazýlým Geliþtirici Yetiþtirme Kampý (JAVA + REACT)
 * 4 May 2021
 */
package ders4Odev3_GameManagementSystem.Concrete;

import ders4Odev3_GameManagementSystem.Abstract.GameItemService;
import ders4Odev3_GameManagementSystem.Entities.GameItem;

public class GameItemManager implements GameItemService {

	@Override
	public void add(GameItem entity) {
		System.out.println("Yeni Oyun Ýtemi Eklendi: " + entity.toString());
	}

	@Override
	public void update(GameItem entity) {
		System.out.println("Oyun Ýtemi Güncellendi: " + entity.toString());
	}

	@Override
	public void delete(GameItem entity) {
		System.out.println("Oyun Ýtemi Silindi: " + entity.toString());
	}

}
