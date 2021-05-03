/*
 * Copyright (C) 2021 <https://github.com/burakhayirli>
 * @author BURAKHAYIRLI
 * Yazýlým Geliþtirici Yetiþtirme Kampý (JAVA + REACT)
 * 30 Nis 2021
 */
package ders1_2_3_birlestirilmis_odevler;

public class StudentManager extends UserManager {
	@Override
	public void add(User user) {
		System.out.println(user.getName()+" "+user.getSurname() + " isminde yeni bir öðrenci eklendi.");
	}

	public void registerCourse(Course course) {
		System.out.println("Öðrenci," + course.getName() + " isimli kursa kayýt yaptý.");
	}

	
	public void participateCourse(CourseLessonItem courseLessonItem) {
		System.out.println("Öðrenci, " +courseLessonItem.getCourseLessonId()+" idli kurs dersinin "+  courseLessonItem.getTitle() + " isimli konusuna katýlým saðladý.");
	}

	@Override
	public void comment(CourseLessonItem courseLessonItem) {
		System.out.println(
				"Öðrenci, " + courseLessonItem.getCourseLessonId() + " numaralý kurs görevine bir yorum yaptý.");
	}
}
