/*
 * Copyright (C) 2021 <https://github.com/burakhayirli>
 * @author BURAKHAYIRLI
 * Yazýlým Geliþtirici Yetiþtirme Kampý (JAVA + REACT)
 * 4 May 2021
 */
package ders4Odev3_GameManagementSystem.Abstract;

import ders4Odev3_GameManagementSystem.Entities.Campaign;
import ders4Odev3_GameManagementSystem.Entities.GameItem;
import ders4Odev3_GameManagementSystem.Entities.Player;

public interface GameService {

	void registerPlayer(Player player);
	void addNewGameItem(GameItem gameItem);
	void addNewCampaign(Campaign campaign);
	
}
