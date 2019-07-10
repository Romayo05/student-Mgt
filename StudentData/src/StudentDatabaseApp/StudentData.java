package StudentDatabaseApp;

import java.util.Scanner;

public class StudentData {

	public static void main(String[] args) {
		
		
	//ask number of students to enroll
		System.out.println("How many students do you want to enroll");
		Scanner in = new Scanner(System.in);
		int numOfStudents = in.nextInt();
		Student[] students = new Student[numOfStudents];
		
		//create a number of new students
		for(int n=0; n<numOfStudents; n++) {
			students[n] = new Student(null,null);
			students[n].enroll();
			students[n].payTuition();
			System.out.println(students[n].toString());
			
			
		}
		

	}

}
