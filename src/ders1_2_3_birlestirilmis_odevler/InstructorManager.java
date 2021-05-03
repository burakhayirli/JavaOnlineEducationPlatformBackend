/*
 * Copyright (C) 2021 <https://github.com/burakhayirli>
 * @author BURAKHAYIRLI
 * Yazýlým Geliþtirici Yetiþtirme Kampý (JAVA + REACT)
 * 30 Nis 2021
 */
package ders1_2_3_birlestirilmis_odevler;

public class InstructorManager extends UserManager{

	@Override
	public void add(User user) {
		System.out.println(user.getName()+" "+user.getSurname()+ " isminde yeni bir eðitmen eklendi.");
	}
	
	public void addCourse(Course course) {
		System.out.println("Eðitmen "+course.getName()+ " isminde yeni bir kurs ekledi.");
	}
	
	public void addLessonToCourse(CourseLesson courseLesson) {
		System.out.println("Eðitmen "+ courseLesson.getCourseId()+" idli kursa ait " +courseLesson.getDayNumber()+ ". dersi ekledi.");
	}
	
	public void addItemToLesson(CourseLessonItem courseLessonItem) {
		System.out.println("Eðitmen "+ courseLessonItem.getCourseLessonId()+" idli kursa ait " +courseLessonItem.getTitle()+ " baþlýklý bir görev ekledi.");	
	}
	
	@Override
	public void comment(CourseLessonItem courseLessonItem) {
		System.out.println("Eðitmen "+courseLessonItem.getCourseLessonId()+" idli kurs görevine bir yorum yaptý.");
	}
	
}
