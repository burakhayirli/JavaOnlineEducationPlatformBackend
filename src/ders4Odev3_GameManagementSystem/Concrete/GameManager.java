/*
 * Copyright (C) 2021 <https://github.com/burakhayirli>
 * @author BURAKHAYIRLI
 * Yazýlým Geliþtirici Yetiþtirme Kampý (JAVA + REACT)
 * 4 May 2021
 */
package ders4Odev3_GameManagementSystem.Concrete;

import java.util.ArrayList;

import ders4Odev3_GameManagementSystem.Abstract.GameItemService;
import ders4Odev3_GameManagementSystem.Abstract.GameService;
import ders4Odev3_GameManagementSystem.Abstract.PlayerService;
import ders4Odev3_GameManagementSystem.Entities.Campaign;
import ders4Odev3_GameManagementSystem.Entities.GameItem;
import ders4Odev3_GameManagementSystem.Entities.Player;

public class GameManager implements GameService {

	PlayerService playerService;
	GameItemService gameItemService;
	
	
	private Player activePlayer;

	public ArrayList<GameItem> gameItemList;
	public ArrayList<Campaign> campaignList;

	public GameManager() {
		System.out.println("Oyun oluþturuldu ve baþladý.");
		gameItemList = new ArrayList<GameItem>();
		campaignList=new ArrayList<Campaign>();
	}

	public GameManager(PlayerService playerService, GameItemService gameItemService) {
		this();
		this.playerService = playerService;
		this.gameItemService = gameItemService;
	}

	public Player getActivePlayer() {
		return activePlayer;
	}

	public void setActivePlayer(Player activePlayer) {
		this.activePlayer = activePlayer;
	}

	@Override
	public void registerPlayer(Player player) {
		playerService.add(player);
		setActivePlayer(player);
	}

	@Override
	public void addNewGameItem(GameItem gameItem) {
		gameItemService.add(gameItem);
		gameItemList.add(gameItem);
	}

	@Override
	public void addNewCampaign(Campaign campaign) {
		

	}

}
