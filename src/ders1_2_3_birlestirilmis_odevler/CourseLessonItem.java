/*
 * Copyright (C) 2021 <https://github.com/burakhayirli>
 * @author BURAKHAYIRLI
 * Yazýlým Geliþtirici Yetiþtirme Kampý (JAVA + REACT)
 * 28 Nis 2021
 */

package ders1_2_3_birlestirilmis_odevler;

import java.sql.Date;

public class CourseLessonItem {

	private int id;
	private int courseLessonId;
	private String title; // Ders Programý, 1. Gün Sonu Kayýt, Ödev 1 vs.
	private String content;
	private Comment[] comments;
	private int priority;
	private Date createdDate;
	private Date updatedDate;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCourseLessonId() {
		return courseLessonId;
	}

	public void setCourseLessonId(int courseLessonId) {
		this.courseLessonId = courseLessonId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Comment[] getComments() {
		return comments;
	}

	public void setComments(Comment[] comments) {
		this.comments = comments;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
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

	public CourseLessonItem() {

	}

	public CourseLessonItem(int id, int courseLessonId, String title, String content, Comment[] comments, int priority,
			Date createdDate, Date updatedDate) {
		super();
		this.id = id;
		this.courseLessonId = courseLessonId;
		this.title = title;
		this.content = content;
		this.comments = comments;
		this.priority = priority;
		this.createdDate = createdDate;
		this.updatedDate = updatedDate;
	}
}