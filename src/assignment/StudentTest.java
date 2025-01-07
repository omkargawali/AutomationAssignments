package assignment;

public class StudentTest {

	public static void main(String[] args) {

		StudentGrades studentGrades = new StudentGrades();

		// Add grades for students
		studentGrades.addNewStudentGrade("bharat", "A");
		studentGrades.addNewStudentGrade("omkar", "B");
		studentGrades.addNewStudentGrade("soham", "A+");

		// View all student grades
		studentGrades.viewGrades();

		// Remove a grade for a student
		studentGrades.removeGrade("omkar");

		// View all student grades after removal
		studentGrades.viewGrades();

	
	}

}
