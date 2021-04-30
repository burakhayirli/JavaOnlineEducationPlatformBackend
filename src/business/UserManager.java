/*
 * Copyright (C) 2021 <https://github.com/burakhayirli>
 * @author BURAKHAYIRLI
 * Yazýlým Geliþtirici Yetiþtirme Kampý (JAVA + REACT)
 * 30 Nis 2021
 */
package business;

import models.CourseLessonItem;
import models.User;

public class UserManager {	
	
	public void addNewUser(User user) {
		System.out.println(user.getName()+ " isminde yeni bir kullanýcý eklendi.");
	}
	
	public void comment(CourseLessonItem courseLessonItem) {
		System.out.println(courseLessonItem.getCourseLessonId()+" numaralý kurs görevine bir kullanýcý yorum yaptý.");
	}
	
}
