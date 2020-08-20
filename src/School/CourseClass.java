package School;


public class CourseClass {

	/*
	 * 4) Courses class 
	 *    * there should be course id, season, name, cost variables 
	 *    * there should be constructors to create course objects 
	 *    * there should be a method for printing course information
	 * 
	 */

	private int courseId, costOfCourse;
	private String courseName, courseSeason;

	CourseClass() {

	}

	CourseClass(int courseId, String courseName, String courseSeason, int costOfCourse) {
		this.courseId = courseId;
		this.courseName = courseName;
		this.courseSeason = courseSeason;
		this.costOfCourse = costOfCourse;

	}

	public String toString(CourseClass course) {

		return course.courseId + " " + course.courseName + " " + course.courseSeason + " " + course.costOfCourse;
	}

}