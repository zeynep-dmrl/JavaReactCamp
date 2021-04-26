package campHomework2;

public class Main {

	public static void main(String[] args) {

		Course course1 = new Course();
		course1.id = 1;
		course1.name = "Yazýlým Geliþtirici Yetistirme Kampý(C# + ANGULAR)";
		course1.detail = "2 ay sürecek ücretsiz ve profesyonel bir programla, sýfýrdan yazýlým geliþtirme öðreniyoruz.";
		course1.instructor = "Engin Demirog";
		course1.price = "Ucretsiz";
		
		Course course2 = new Course();
		course2.id = 2;
		course2.name = "Yazýlým Geliþtirici Yetistirme Kampý(Java + React)";
		course2.detail = "2 ay sürecek ücretsiz ve profesyonel bir programla, sýfýrdan yazýlým geliþtirme öðreniyoruz.";
		course2.instructor = "Engin Demirog";
		course2.price = "Ucretsiz";
		
		Course course3 = new Course();
		course3.id = 3;
		course3.name = "Programlamaya Giris icin Temel Kurs";
		course3.detail = "PYTHON, JAVA, C# gibi tüm programlama dilleri için temel programlama mantýðýný anlaþýlýr örneklerle öðrenin.";
		course3.instructor = "Engin Demirog";
		course3.price = "Ucretsiz";
		
		
		Course[] courses = {course1,course2,course3};
		
		for(Course course : courses) {
			System.out.println(course.id+"\t"+course.name+"\t"+course.detail+"\t"+course.instructor+"\t"+course.price); 
		}
		
		Manager courseManager = new Manager();
		courseManager.addtoCourse(course1);
		courseManager.addtoCourse(course2);
		courseManager.addtoCourse(course3);
		courseManager.deleteCourse(course3);
		
		Student std1 = new Student("Zeynep","Demirel","zd.mail");
		Student std2 = new Student("dfgggg","cfdg","a.mail");
		Student std3 = new Student("oluy","wdscds","b.mail");
		
		Student[] student = {std1,std2,std3};
		course2.students = student;
		
		course2.write(course2.students);
		
	}

}

