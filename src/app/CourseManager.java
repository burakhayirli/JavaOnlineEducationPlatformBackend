/*
 * Copyright (C) 2021 <https://github.com/burakhayirli>
 * @author BURAKHAYIRLI
 * Yazýlým Geliþtirici Yetiþtirme Kampý (JAVA + REACT)
 * 28 Nis 2021
 */
package app;

import models.Course;
import models.User;

public class CourseManager {

    public CourseManager() {
    	
    }
    
	public void addCourse(Course course) {		
		System.out.println("Yeni Kurs Eklendi ve Eðitmen Atandý. "+course.getName());
	} 
	
	public void addInstructor(User user) {
		System.out.println("Yeni Eðitmen Eklendi. "+user.getName()+" "+user.getSurname()+" | "+user.getDetail());
	}
	
	public void addStudent(User user) {
		System.out.println("Yeni Öðrenci Eklendi. "+user.getName()+" "+user.getSurname()+" | "+user.getDetail());
	}
	
}
