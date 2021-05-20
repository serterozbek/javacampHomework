package oopHomework;

public class Main {

	public static void main(String[] args) {

		Course course1 = new Course(1, "C# + Angular", "Engin Demiroð", 45);

		Course course2 = new Course(2,"JAVA + REACT","Engin Demiroð",28);
		Course course3 = new Course(3,"Programlamaya Giriþ","Engin Demiroð",100);

		Course[] courses = { course1, course2, course3 };
		for (Course course : courses) {
			System.out.println(course.name+" Kursu");
		}
		
		Category category1 = new Category();
		category1.id = 1;
		category1.name = "Programlama";
		
		Category[] categories = {category1};
		for (Category category : categories) {
			System.out.println(category.name+" Ýsimli Kategori Listelendi");
		}
		
		CourseManager courseManager = new CourseManager();
		courseManager.joinToCourse(course2);
		courseManager.quitToCourse(course3);
		
		
		
	}
	
}
