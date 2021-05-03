/*
 * Copyright (C) 2021 <https://github.com/burakhayirli>
 * @author BURAKHAYIRLI
 * Yazýlým Geliþtirici Yetiþtirme Kampý (JAVA + REACT)
 * 30 Nis 2021
 */
package ders1_2_3_birlestirilmis_odevler;

public class UserManager {	
	
	public void add(User user) {
		System.out.println(user.getName()+ " isminde yeni bir kullanýcý eklendi.");
	}
	
	public void comment(CourseLessonItem courseLessonItem) {
		System.out.println(courseLessonItem.getCourseLessonId()+" numaralý kurs görevine bir kullanýcý yorum yaptý.");
	}
	
}
