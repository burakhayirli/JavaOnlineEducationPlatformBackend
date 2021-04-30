/*
 * Copyright (C) 2021 <https://github.com/burakhayirli>
 * @author BURAKHAYIRLI
 * Yaz�l�m Geli�tirici Yeti�tirme Kamp� (JAVA + REACT)
 * 30 Nis 2021
 */
package business;

import models.CourseLessonItem;
import models.User;

public class UserManager {	
	
	public void addNewUser(User user) {
		System.out.println(user.getName()+ " isminde yeni bir kullan�c� eklendi.");
	}
	
	public void comment(CourseLessonItem courseLessonItem) {
		System.out.println(courseLessonItem.getCourseLessonId()+" numaral� kurs g�revine bir kullan�c� yorum yapt�.");
	}
	
}
