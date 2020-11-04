package collector;

import entity.Student;
import java.util.*;

public class collectors {
	private ArrayList<Student> std;
	
	public collectors() {
		std=new ArrayList<Student>();
	}
	
	public boolean addStudent(Student s) {
		if(s!=null) {
			std.add(s);
			return true;
		}
		return false;
	}
	
	public String toString() {
		String out="";
		for(Student s:std) {
			out+=s.toString();
		}
		return out;
	}
	
	public void sortStudents() {
	   	Collections.sort(std);
	}
}
