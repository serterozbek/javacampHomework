package kodlamaioProject;

public class Instructor extends User {

	public Instructor(int id, String firstName, String lastName, String email, String lesson) {
		super();
		this.lesson = lesson;
	}

	public Instructor() {

	}

	private String lesson;

	public String getLesson() {
		return lesson;
	}

	public void setLesson(String lesson) {
		this.lesson = lesson;
	}

}
