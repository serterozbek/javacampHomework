package kodlamaioProject;

public class Student extends User {

	public Student(int id, String firstName, String lastName, String email, int percentageOfCompletion,
			String studentNumber) {
		super();
		this.percentageOfCompletion = percentageOfCompletion;
		this.studentNumber = studentNumber;
	}

	public Student() {

	}

	private int percentageOfCompletion;
	private String studentNumber;

	public int getPercentageOfCompletion() {
		return percentageOfCompletion;
	}

	public void setPercentageOfCompletion(int percentageOfCompletion) {
		this.percentageOfCompletion = percentageOfCompletion;
	}

	public String getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}
}
