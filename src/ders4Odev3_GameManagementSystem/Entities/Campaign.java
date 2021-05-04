/*
 * Copyright (C) 2021 <https://github.com/burakhayirli>
 * @author BURAKHAYIRLI
 * Yazýlým Geliþtirici Yetiþtirme Kampý (JAVA + REACT)
 * 4 May 2021
 */
package ders4Odev3_GameManagementSystem.Entities;

import ders4Odev3_GameManagementSystem.Abstract.Entity;

public class Campaign implements Entity {
	int id;
	String code;
	String name;
	double discount;

	public Campaign() {

	}

	public Campaign(int id, String code, String name, double discount) {
		super();
		this.id = id;
		this.name = name;
		this.discount = discount;
	}

	@Override
	public String toString() {
		return "Campaign [id=" + id + ", code=" + code + ", name=" + name + ", discount=%" + discount + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

}
