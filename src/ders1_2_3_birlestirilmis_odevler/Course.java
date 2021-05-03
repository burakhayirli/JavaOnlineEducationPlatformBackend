/*
 * Copyright (C) 2021 <https://github.com/burakhayirli>
 * @author BURAKHAYIRLI
 * Yazýlým Geliþtirici Yetiþtirme Kampý (JAVA + REACT)
 * 28 Nis 2021
 */

package ders1_2_3_birlestirilmis_odevler;

import java.sql.Date;

public class Course {
	
	private int id;
	private int instructorId;
	private String name;
	private String image;
	private boolean active;
	private Date createdDate;
	private Date updatedDate;
	
	public Course() {
		
	}
	
	public Course(int id, int instructorId, String name, String image,boolean active, Date createdDate, Date updatedDate) {
		super();
		this.id = id;
		this.instructorId = instructorId;
		this.name = name;
		this.image=image;
		this.active = active;
		this.createdDate = createdDate;
		this.updatedDate = updatedDate;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getInstructorId() {
		return instructorId;
	}

	public void setInstructorId(int instructorId) {
		this.instructorId = instructorId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}
	
}





