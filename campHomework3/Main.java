package campHomework3;

public class Main {

	public static void main(String[] args) {
		
		Student std1 = new Student();
		std1.setFirstname("ogrenci");
		std1.setLastname("1");
		std1.setEmail("xy.com");
		std1.setPassword("123456");
		std1.takenCourse = "Java";
		
		StudentManager std1Manager = new StudentManager();
		std1Manager.addCourse(std1);
		
		Student std2 = new Student();
		std2.setFirstname("ogrenci");
		std2.setLastname("2");
		std2.setEmail("yz.com");
		std2.setPassword("963852");
		std2.takenCourse = "C#";
		
		StudentManager std2Manager = new StudentManager();
		std2Manager.addCourse(std2);
		std2Manager.deleteCourse(std2);
		
		Student std3 = new Student();
		std3.setFirstname("ogrenci");
		std3.setLastname("3");
		std3.setEmail("kl.com");
		std3.setPassword("147852");
		std3.takenCourse = "Python";
		StudentManager std3Manager = new StudentManager();
		std3Manager.addCourse(std3);
		
		Instructor instructor = new Instructor();
		instructor.setFirstname("instructor");
		instructor.setLastname("dfdgf");
		instructor.setEmail("abc.com");
		instructor.setPassword("24680");
		instructor.givenCourse = "Java-React";
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.addCourse(instructor);
		instructorManager.addHomework("odev1");
		instructorManager.deleteCourse(instructor); 
		
		Users[] users= {std1,std2,std3,instructor};
		UsersManager manager = new UsersManager();
		manager.addMultiple(users);
		manager.display(users);
		
		
		
		
	}

}
