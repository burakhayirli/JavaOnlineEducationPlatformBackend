/*
 * Copyright (C) 2021 <https://github.com/burakhayirli>
 * @author BURAKHAYIRLI
 * Yazýlým Geliþtirici Yetiþtirme Kampý (JAVA + REACT)
 * 3 May 2021
 */
package ders4Odev3_GameManagementSystem.Abstract;

import ders4Odev3_GameManagementSystem.Entities.Player;

public interface PlayerCheckService {
	boolean CheckIfRealPerson(Player customer);
}
