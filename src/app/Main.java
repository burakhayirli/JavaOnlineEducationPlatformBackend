/*
 * Copyright (C) 2021 <https://github.com/burakhayirli>
 * @author BURAKHAYIRLI
 * Yazýlým Geliþtirici Yetiþtirme Kampý (JAVA + REACT)
 * 28 Nis 2021
 */
package app;

import business.InstructorManager;
import business.StudentManager;
import models.Course;
import models.CourseLesson;
import models.CourseLessonItem;
import models.Instructor;
import models.Student;
import models.User;

public class Main {

	public static void main(String[] args) {
		//Ders3 Begin
		Instructor instructor1 = new Instructor();
		instructor1.setId(1);
		instructor1.setName("Engin");
		instructor1.setSurname("Demiroð");
		instructor1.setDetail("(MCT) ,PMP ve ITIL sertifikalarýna sahip");

		Student student = new Student();
		student.setId(2);
		student.setName("Burak");
		student.setSurname("Hayýrlý");
		student.setDetail("(MCT) ,PMP ve ITIL sertifikalarýna sahip deðil");
		
		Course course1=new Course(1, 1,"Yazýlým Geliþtirici Yetiþtirme Kampý (Java + React)", "", true, null, null);
		Course course2=new Course(2, 1,"Yazýlým Geliþtirici Yetiþtirme Kampý (C# + Angular)", "", true, null, null);
		Course course3=new Course(3, 1, "Programlamaya Giriþ için Temel Kurs", "",true, null, null);
		
		CourseLesson courseLesson1=new CourseLesson();
		courseLesson1.setId(1);
		courseLesson1.setDayNumber(1);
		
		CourseLesson courseLesson2=new CourseLesson();
		courseLesson2.setId(2);
		courseLesson2.setDayNumber(2);
		
		CourseLesson courseLesson3=new CourseLesson();
		courseLesson3.setId(3);
		courseLesson3.setDayNumber(3);
		
		
		CourseLessonItem courseLessonItem1=new CourseLessonItem();
		courseLessonItem1.setId(1);
		courseLessonItem1.setCourseLessonId(1);
		courseLessonItem1.setTitle("Ders Programý");
		
		CourseLessonItem courseLessonItem2=new CourseLessonItem();
		courseLessonItem2.setId(2);
		courseLessonItem2.setCourseLessonId(1);
		courseLessonItem2.setTitle("1. Gün Sonu Kayýt");
		
		CourseLessonItem courseLessonItem3=new CourseLessonItem();
		courseLessonItem3.setId(3);
		courseLessonItem3.setCourseLessonId(1);
		courseLessonItem3.setTitle("Ödev 1");
		
		CourseLessonItem courseLessonItem4=new CourseLessonItem();
		courseLessonItem4.setId(4);
		courseLessonItem4.setCourseLessonId(1);
		courseLessonItem4.setTitle("Deðerlendirme");
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(instructor1);
		instructorManager.addCourse(course1);
		instructorManager.addCourse(course2);
		instructorManager.addCourse(course3);
		System.out.println("********************************************"); 
		StudentManager studentManager = new StudentManager();
		studentManager.add(student);
		studentManager.registerCourse(course1);
		studentManager.registerCourse(course2);
		studentManager.registerCourse(course3);
		
		studentManager.participateCourse(courseLessonItem1);
		studentManager.participateCourse(courseLessonItem2);
		studentManager.participateCourse(courseLessonItem3);
		studentManager.participateCourse(courseLessonItem4);
		
		//Ders3 End
		
		
		// Ders2
		/*
		 * CourseManager courseManager=new CourseManager();
		 * 
		 * System.out.println("Eðitmen ve Öðrenciler Ekleniyor...");
		 * courseManager.addInstructor(instructor1); courseManager.addStudent(student);
		 * 
		 * User[] instructors= {instructor1}; User[] students= {student};
		 * 
		 * 
		 * 
		 * System.out.println("********************************************"); Course
		 * course1=new Course(1, 1,
		 * "Yazýlým Geliþtirici Yetiþtirme Kampý (Java + React)", "", true, null, null);
		 * Course course2=new Course(2, 2,
		 * "Yazýlým Geliþtirici Yetiþtirme Kampý (C# + Angular)", "", true, null, null);
		 * Course course3=new Course(3, 1, "Programlamaya Giriþ için Temel Kurs", "",
		 * true, null, null);
		 * 
		 * System.out.println("Kurslar Ekleniyor..."); courseManager.addCourse(course1);
		 * courseManager.addCourse(course2); courseManager.addCourse(course3);
		 * 
		 * Course[] courses= {course1,course2,course3};
		 * 
		 * System.out.println("********************************************");
		 * System.out.println("Toplam "+instructors.length+"  Adet Eðitmen Bulundu.");
		 * for (User instructor : instructors) {
		 * System.out.println(instructor.getName()+" "+instructor.getSurname()
		 * +" | Detay: "+instructor.getDetail()); }
		 * 
		 * System.out.println("********************************************");
		 * System.out.println("Toplam "+instructors.length+"  Adet Öðrenci Bulundu.");
		 * for (User studentItem : students) {
		 * System.out.println(studentItem.getName()+" "+studentItem.getSurname()
		 * +" | Detay: "+studentItem.getDetail()); }
		 * 
		 * 
		 * System.out.println("********************************************");
		 * System.out.println("Toplam "+courses.length+"  Adet Kurs Bulundu."); for
		 * (Course course : courses) { System.out.println(course.getName()); }
		 */
	}

}
