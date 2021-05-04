/*
 * Copyright (C) 2021 <https://github.com/burakhayirli>
 * @author BURAKHAYIRLI
 * Yazýlým Geliþtirici Yetiþtirme Kampý (JAVA + REACT)
 * 4 May 2021
 */
package ders4Odev3_GameManagementSystem.Entities;

import ders4Odev3_GameManagementSystem.Abstract.Entity;

public class Selling implements Entity {
	private int id;
	private Player player;
	private Campaign campaign;
	private GameItem gameItem;
	

	public Selling() {
	}

	public Selling(int id, Player player, Campaign campaign, GameItem gameItem) {
		super();
		this.id = id;
		this.player = player;
		this.campaign = campaign;
		this.gameItem = gameItem;	
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	public Campaign getCampaign() {
		return campaign;
	}

	public void setCampaign(Campaign campaign) {
		this.campaign = campaign;
	}

	public GameItem getGameItem() {
		return gameItem;
	}

	public void setGameItem(GameItem gameItem) {
		this.gameItem = gameItem;
	}

	public double getDiscountedPrice() {
		return gameItem.getPrice() - (gameItem.getPrice() * campaign.discount / 100);
	}

}
