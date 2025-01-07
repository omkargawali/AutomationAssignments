package assignment;

import java.util.HashMap;
import java.util.Map;

public class StudentGrades {

	
	Map<String, String> grades = new HashMap<String, String>();


	public void addNewStudentGrade(String studentName, String grade) {

		grades.put(studentName, grade);
	}

	public void removeGrade(String studentName) {

		grades.remove(studentName);
	}

	public void viewGrades() {

		System.out.println("Student Grades:");
		for (String student : grades.keySet()) {
            System.out.println(student + ": " + grades.get(student));
		}

	}

}
