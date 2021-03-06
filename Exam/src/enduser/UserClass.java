package enduser;

import entity.Student;
import java.util.Scanner;
import collector.collectors;

public class UserClass {

	private static Scanner  sc = new Scanner(System.in);
	collectors l1 =new collectors();
	public static void main(String[] args) {
		UserClass u=new UserClass();
		boolean repeat = true;
		while(repeat) {
				switch(u.mainMenu()) {
					case 1: u.insertStudent();
							break;
					case 2: u.displayStudentDetails();
							break;
					case 3: u.sortStudents();
							break;
					default: repeat = false;
				}
		}
	}
	public void insertStudent() {
		System.out.println("Enter Student Id");
		int id=sc.nextInt();
		System.out.println("Enter Student Name");
		String name=sc.next();
		System.out.println("Enter Student Gender");
		String gender=sc.next();
		System.out.println("Enter Student Location");
		String location=sc.next();
		System.out.println("Enter Student Pincode");
		int pincode=sc.nextInt();
		Student s = new Student(id,name,gender,location,pincode);
		l1.addStudent(s);
		
	}
	public int mainMenu() {
		System.out.println("1.Add Student");
		System.out.println("2.Display Students");
		System.out.println("3.Sort Students");
		System.out.println("Enter any other number to exit");
		return sc.nextInt();
	}
	public void sortStudents() {
	   	l1.sortStudents();
		System.out.println("*****Sorted by Name and Location*****");
	}
	public void displayStudentDetails() {
		System.out.println(l1);
	}
}
