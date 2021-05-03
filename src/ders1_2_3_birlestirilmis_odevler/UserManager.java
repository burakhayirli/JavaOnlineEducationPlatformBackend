/*
 * Copyright (C) 2021 <https://github.com/burakhayirli>
 * @author BURAKHAYIRLI
 * Yaz�l�m Geli�tirici Yeti�tirme Kamp� (JAVA + REACT)
 * 30 Nis 2021
 */
package ders1_2_3_birlestirilmis_odevler;

public class UserManager {	
	
	public void add(User user) {
		System.out.println(user.getName()+ " isminde yeni bir kullan�c� eklendi.");
	}
	
	public void comment(CourseLessonItem courseLessonItem) {
		System.out.println(courseLessonItem.getCourseLessonId()+" numaral� kurs g�revine bir kullan�c� yorum yapt�.");
	}
	
}
