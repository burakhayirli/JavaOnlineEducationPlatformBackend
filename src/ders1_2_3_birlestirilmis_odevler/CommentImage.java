/*
 * Copyright (C) 2021 <https://github.com/burakhayirli>
 * @author BURAKHAYIRLI
 * Yazýlým Geliþtirici Yetiþtirme Kampý (JAVA + REACT)
 * 28 Nis 2021
 */

package ders1_2_3_birlestirilmis_odevler;

import java.sql.Date;

public class CommentImage {

	private int id;
	private int commentId;
	private String image;
	private Date createdDate;

	public CommentImage() {

	}

	public CommentImage(int id, int commentId, String image, Date createdDate) {
		super();
		this.id = id;
		this.commentId = commentId;
		this.image = image;
		this.createdDate = createdDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCommentId() {
		return commentId;
	}

	public void setCommentId(int commentId) {
		this.commentId = commentId;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
}
