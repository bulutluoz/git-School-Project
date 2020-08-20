package School;

import java.util.Scanner;

public class _SchoolProject {
	public static void main(String[] args) {

	// =============teacherCreation============
		TeacherClass teacher01 = new TeacherClass();
		teacher01.setName("Suleyman");
		teacher01.setSurname("Alptekin");
		teacher01.setBranch("Java");
		teacher01.setPhoneNumber("5553625147");
		TeacherClass teacher02 = new TeacherClass("Ahmet" , "Bayram" , "Selenium" , "5555685478");
		
		
	// =============creating teachers object for using TeachersClass ================
		TeachersClass teachers = new TeachersClass();
		teachers.addTeacherToList(teacher01);
		teachers.addTeacherToList(teacher02);
		
	// ============ course creation ======================
		
		CourseClass course101 = new CourseClass(101,"QA" , "Summer", 800);
		CourseClass course102 = new CourseClass(102,"Web Developer" , "Summer", 900);
		CourseClass course103 = new CourseClass(103,"Java Developer" , "Summer", 1000);
		CourseClass course104 = new CourseClass(104,"DevOps" , "Summer", 1100);
	
	// =============creating courses object for using CoursesClass ================ 

		CoursesClass courses = new CoursesClass();
		courses.courseList.add(course101);
		courses.courseList.add(course102);
		courses.courseList.add(course103);
		courses.courseList.add(course104);
		
	// ================= begining of the interactive program ==================
		
		int goToProcess=1;
		StudentClass student=new StudentClass();
		
		do {
			System.out.println("");
			System.out.println("===============================");

			Scanner scan =new Scanner (System.in);
			
			System.out.println("Welcome to world of future "
					+ "\nWhat would you like to do ? "
					+ "\n1-School informations "
					+ "\n2-List of teachers "
					+ "\n3-List of Our Courses+"
					+ "\n4-Create new student+"
					+ "\n5-Print All Students "
					+ "\n6-Show student information with id "
					+ "\n7-Delete student by id");
			
			System.out.println("Please enter '0' for Quit");
			
			goToProcess= scan.nextInt();
			
			
			switch(goToProcess) {

		 	case 1: {
		 		printSchoolInformation();
		 		
		 		break;
		 		}
		 	case 2: {
		 		
		 		teachers.printTeachers();
		 		System.out.println("We have " + teachers.numbersOfTeachers() + " Expert Instructors");
		 		break;
		 		}
		 	case 3: {
		 		courses.printCourses();
		 		System.out.println("We have " + courses.numberOfCourse()+ " courses available");
		 		break;
		 		}
		 	case 4: {
		 		student.createNewStudent();
		 		break;
		 		}
		 	case 5: {
		 		student.printStudents();
		 		break;
		 		}	 
		 	case 6: {
		 		student.getStudentInfo();
		 		break;
		 		}	
		 	case 7: {
		 		student.removeStudent();
		 		break;
		 		}	

		}
		}while (goToProcess!=0);
		
		
		System.out.println("Thanks for choosing us");
		
		
	} // end of main method
	
	public static void printSchoolInformation() {
		System.out.println("===== SCHOOL INFORMATION======");
		System.out.println("Name : " + ConstantData.NAME);
		System.out.println("Web Address : " + ConstantData.WEB_ADDRESS);
		System.out.println("Phone Number : " + ConstantData.PHONE_NUMBER);
		System.out.println("address : " + ConstantData.ADDRESS);
		
	}
	
	   
}