package School;

import java.util.ArrayList;
import java.util.List;

public class CoursesClass {
	/*
	 * 5) Courses class 
	 *     * there should be a list to store all courses 
	 *     * there should be a method to add courses to courses list 
	 *     * there should be a method to print all courses 
	 *     * there should be a method to print numbers of courses
	 * 
	 */

	List<CourseClass> courseList = new ArrayList<>();
	
	public void addCourse(CourseClass course) {
		courseList.add(course);
	}
	
	
	public void printCourses() {
		System.out.println("=====Courses List From CoursesClass====");
		for(CourseClass each:courseList) {
			System.out.println(each.toString(each));
		}
		
	}
	
	public int numberOfCourse() {
		
		return courseList.size();
	}

}