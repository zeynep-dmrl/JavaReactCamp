package campHomework2;

public class Manager {
	
	public void addtoCourse(Course course) {
		
		System.out.println(course.name+" kursu olusturuldu."); 
	}
	public void deleteCourse(Course course) {
		System.out.println(course.name+"("+course.id+")"+" kursu kaldırıldı.");
	}
	
}
