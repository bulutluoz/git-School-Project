package School;

import java.util.ArrayList;
import java.util.List;

public class TeachersClass {
	/*
	 * 3) Teachers class 
	 *    * there should be a list to store all teachers  
	 *    * there should be a method to add teachers to teachers list 
	 *    * there should be a method to print all teachers 
	 *    * there should be a method to print numbers of teachers
	 */
	
	List<TeacherClass> teachersList = new ArrayList<>();
	
	public void addTeacherToList(TeacherClass teacher ) {
		
		teachersList.add(teacher);
	}
	
	public void printTeachers() {
		
		System.out.println("=== teachers list from teachers class=====");
		for (TeacherClass each : teachersList) {
			
			System.out.println(each.toString(each));
	    }
		
		
	}
	
	public int numbersOfTeachers() {
		
		return teachersList.size();
	}
}