/*
 * Copyright (C) 2021 <https://github.com/burakhayirli>
 * @author BURAKHAYIRLI
 * Yaz�l�m Geli�tirici Yeti�tirme Kamp� (JAVA + REACT)
 * 30 Nis 2021
 */
package ders1_2_3_birlestirilmis_odevler;

public class InstructorManager extends UserManager{

	@Override
	public void add(User user) {
		System.out.println(user.getName()+" "+user.getSurname()+ " isminde yeni bir e�itmen eklendi.");
	}
	
	public void addCourse(Course course) {
		System.out.println("E�itmen "+course.getName()+ " isminde yeni bir kurs ekledi.");
	}
	
	public void addLessonToCourse(CourseLesson courseLesson) {
		System.out.println("E�itmen "+ courseLesson.getCourseId()+" idli kursa ait " +courseLesson.getDayNumber()+ ". dersi ekledi.");
	}
	
	public void addItemToLesson(CourseLessonItem courseLessonItem) {
		System.out.println("E�itmen "+ courseLessonItem.getCourseLessonId()+" idli kursa ait " +courseLessonItem.getTitle()+ " ba�l�kl� bir g�rev ekledi.");	
	}
	
	@Override
	public void comment(CourseLessonItem courseLessonItem) {
		System.out.println("E�itmen "+courseLessonItem.getCourseLessonId()+" idli kurs g�revine bir yorum yapt�.");
	}
	
}
