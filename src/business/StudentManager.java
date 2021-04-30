/*
 * Copyright (C) 2021 <https://github.com/burakhayirli>
 * @author BURAKHAYIRLI
 * Yaz�l�m Geli�tirici Yeti�tirme Kamp� (JAVA + REACT)
 * 30 Nis 2021
 */
package business;

import models.Course;
import models.CourseLessonItem;
import models.User;

public class StudentManager extends UserManager {
	@Override
	public void add(User user) {
		System.out.println(user.getName()+" "+user.getSurname() + " isminde yeni bir ��renci eklendi.");
	}

	public void registerCourse(Course course) {
		System.out.println("��renci," + course.getName() + " isimli kursa kay�t yapt�.");
	}

	
	public void participateCourse(CourseLessonItem courseLessonItem) {
		System.out.println("��renci, " +courseLessonItem.getCourseLessonId()+" idli kurs dersinin "+  courseLessonItem.getTitle() + " isimli konusuna kat�l�m sa�lad�.");
	}

	@Override
	public void comment(CourseLessonItem courseLessonItem) {
		System.out.println(
				"��renci, " + courseLessonItem.getCourseLessonId() + " numaral� kurs g�revine bir yorum yapt�.");
	}
}
