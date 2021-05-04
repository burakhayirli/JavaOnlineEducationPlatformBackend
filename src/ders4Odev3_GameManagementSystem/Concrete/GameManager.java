/*
 * Copyright (C) 2021 <https://github.com/burakhayirli>
 * @author BURAKHAYIRLI
 * Yazýlým Geliþtirici Yetiþtirme Kampý (JAVA + REACT)
 * 4 May 2021
 */
package ders4Odev3_GameManagementSystem.Concrete;

import java.util.ArrayList;

import ders4Odev3_GameManagementSystem.Abstract.CampaignService;
import ders4Odev3_GameManagementSystem.Abstract.GameItemService;
import ders4Odev3_GameManagementSystem.Abstract.GameService;
import ders4Odev3_GameManagementSystem.Abstract.PlayerService;
import ders4Odev3_GameManagementSystem.Abstract.SellingService;
import ders4Odev3_GameManagementSystem.Entities.Campaign;
import ders4Odev3_GameManagementSystem.Entities.GameItem;
import ders4Odev3_GameManagementSystem.Entities.Player;
import ders4Odev3_GameManagementSystem.Entities.Selling;

public class GameManager implements GameService {

	PlayerService playerService;
	GameItemService gameItemService;
	SellingService sellingService;
	CampaignService campaignService;
	private Player activePlayer;

	public ArrayList<GameItem> gameItemList;
	public ArrayList<Campaign> campaignList;
	public ArrayList<Selling> sellingList;
	
	public GameManager() {
		System.out.println("Oyun oluþturuldu ve baþladý.");
		gameItemList = new ArrayList<GameItem>();
		campaignList=new ArrayList<Campaign>();
		sellingList=new ArrayList<Selling>();
	}

	public GameManager(PlayerService playerService, GameItemService gameItemService, SellingService sellingService,CampaignService campaignService) {
		this();
		this.playerService = playerService;
		this.gameItemService = gameItemService;
		this.sellingService=sellingService;
		this.campaignService=campaignService;
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
		campaignService.add(campaign);
		campaignList.add(campaign);
	}

	@Override
	public void SellItem(Selling selling) {
		sellingService.add(selling);
		
	}

}
