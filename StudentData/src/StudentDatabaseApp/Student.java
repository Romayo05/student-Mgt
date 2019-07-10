package StudentDatabaseApp;

import java.util.Scanner;

public class Student {
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentID;
	private String courses =null;
	private static int tuitionBalance = 0;
	private static int costOfCourse = 600;
	private static int id = 1000;
	private int count = 0;
	
	//constructor for student to enter name and year
	public Student(String firstName, String lastName){
		this.firstName= firstName;
		this.lastName =lastName;
		Scanner ln = new Scanner(System.in);
		System.out.println("Please enter your FirstName: ");
		this.firstName = ln.nextLine();
		
		System.out.println("Please enter your LastName: ");
		this.lastName = ln.nextLine();
		
		System.out.println("1-For Freshman\n2 -For Sophmore\n3 -For Junior\n4 -For Senior\n Enter student Class Level:");
		this.gradeYear = ln.nextInt();
		
		setStudentID();
	  
	   
	    
	    
		
	}
	// Generate ID
	
	private void setStudentID() {
		//Grade Level plus ID	
		 id++;
		studentID =gradeYear+ "" +id;
		}
	//Enroll for courses
	
	public void enroll(){
		
		do {
			System.out.println("Enter course to enroll(Q to quit):");
			Scanner in = new Scanner(System.in);
			String course = in.nextLine();
			if(!course.equals("Q")){
				courses = courses +"\n" +course;
				count++;
				tuitionBalance =count*costOfCourse;
			}
			else {break; }
		}
			
	while(1!=0);
			
	
		
	}
			
			
			
		

	// view balance

		public void viewBalance() {
		System.out.println("Your Balance is $" +tuitionBalance);
	   }
		
		
	//pay tuition
		public void payTuition() {
			viewBalance();
			System.out.print("Please enter the amount you are paying $");
			Scanner in= new Scanner(System.in);
			int payment = in.nextInt();
			tuitionBalance -=payment;
			System.out.println("Thank you for paying you tuition fees of $" +payment );
			viewBalance();
		}
	//show information
		public String toString() {
			return "Name: " +firstName+" " +lastName+
					"\nGrade Level:" +gradeYear+
					"\n Student ID" +studentID+
					"\nEnrolled Course:" +courses+
					"\nTuition Balance: " +tuitionBalance+
					"\nNumber of Units Enrolled:" +count;
		}
	
}

