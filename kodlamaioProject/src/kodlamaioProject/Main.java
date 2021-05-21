package kodlamaioProject;

public class Main {

	public static void main(String[] args) {

		Student user1 = new Student();
		user1.setId(2);
		user1.setEmail("aliyavuz@hotmail.com");
		user1.setFirstName("Ali");
		user1.setLastName("Yavuz");
		user1.setPercentageOfCompletion(38);

		Instructor instructor = new Instructor();
		instructor.setId(1);
		instructor.setFirstName("Engin");
		instructor.setLastName("Demiroð");

		StudentManager studentManager = new StudentManager();
		studentManager.complete(user1);
		studentManager.add(user1);

		InstructorManager instructorManager = new InstructorManager();
		instructorManager.loadToHomework(instructor);

	}

}
