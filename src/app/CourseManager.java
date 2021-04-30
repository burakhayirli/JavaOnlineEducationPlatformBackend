/*
 * Copyright (C) 2021 <https://github.com/burakhayirli>
 * @author BURAKHAYIRLI
 * Yaz�l�m Geli�tirici Yeti�tirme Kamp� (JAVA + REACT)
 * 28 Nis 2021
 */
package app;

import models.Course;
import models.User;

public class CourseManager {

    public CourseManager() {
    	
    }
    
	public void addCourse(Course course) {		
		System.out.println("Yeni Kurs Eklendi ve E�itmen Atand�. "+course.getName());
	} 
	
	public void addInstructor(User user) {
		System.out.println("Yeni E�itmen Eklendi. "+user.getName()+" "+user.getSurname()+" | "+user.getDetail());
	}
	
	public void addStudent(User user) {
		System.out.println("Yeni ��renci Eklendi. "+user.getName()+" "+user.getSurname()+" | "+user.getDetail());
	}
	
}
