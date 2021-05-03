/*
 * Copyright (C) 2021 <https://github.com/burakhayirli>
 * @author BURAKHAYIRLI
 * Yazýlým Geliþtirici Yetiþtirme Kampý (JAVA + REACT)
 * 28 Nis 2021
 */

package ders1_2_3_birlestirilmis_odevler;

import java.sql.Date;

public class CourseLesson {	
	
	int id;
	int courseId;
	int dayNumber;
	Date lessonDate;
	int priority;
	Date createdDate;
	Date updatedDate;

	public CourseLesson() {
		
	}
	
	public CourseLesson(int id, int courseId, int dayNumber, Date lessonDate, int priority, Date createdDate,
			Date updatedDate) {
		super();
		this.id = id;
		this.courseId = courseId;
		this.dayNumber = dayNumber;
		this.lessonDate = lessonDate;
		this.priority = priority;
		this.createdDate = createdDate;
		this.updatedDate = updatedDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public int getDayNumber() {
		return dayNumber;
	}

	public void setDayNumber(int dayNumber) {
		this.dayNumber = dayNumber;
	}

	public Date getLessonDate() {
		return lessonDate;
	}

	public void setLessonDate(Date lessonDate) {
		this.lessonDate = lessonDate;
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

}