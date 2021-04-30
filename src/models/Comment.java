/*
 * Copyright (C) 2021 <https://github.com/burakhayirli>
 * @author BURAKHAYIRLI
 * Yazýlým Geliþtirici Yetiþtirme Kampý (JAVA + REACT)
 * 28 Nis 2021
 */

package models;

import java.sql.Date;

public class Comment {

	private int id;
	private int userId;
	private int courseLessonItemId;
	private String comment;
	private Date createdDate;
	private Date updatedDate;

	public Comment() {
	}

	public Comment(int id, int userId, int courseLessonItemId,String comment, Date createdDate, Date updatedDate) {
		super();
		this.id = id;
		this.userId = userId;
		this.courseLessonItemId=courseLessonItemId;
		this.comment = comment;
		this.createdDate = createdDate;
		this.updatedDate = updatedDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getCourseLessonItemId() {
		return courseLessonItemId;
	}

	public void setCourseLessonItemId(int courseLessonItemId) {
		this.courseLessonItemId = courseLessonItemId;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
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
