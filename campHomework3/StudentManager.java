package campHomework3;

public class StudentManager extends UsersManager{
	
	@Override
	public void add(Users user) {
		System.out.println(user.getFirstname()+" eklendi."); 
		
	}
	
	public void addCourse(Student student) {
		System.out.println("Kay�t yap�lan course: "+student.takenCourse);
	}
	
	public void deleteCourse(Student student) {
		
		System.out.println(student.getCourseId() + student.takenCourse+" kursundan kay�t silindi");
	}
		
	
	
	
}
