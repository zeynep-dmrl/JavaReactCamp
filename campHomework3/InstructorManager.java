package campHomework3;

public class InstructorManager extends UsersManager{
	
	@Override
	public void add(Users user) {
		System.out.println(user.getFirstname()+" egitmen eklendi");
	}
	
	public void addCourse(Instructor �nstructor) {
		System.out.println(�nstructor.givenCourse+" kursu baslat�ld�."); 
	}
	
	public void deleteCourse(Instructor �nstructor) {
		System.out.println(�nstructor.givenCourse+":"+�nstructor.getCourseId()+" kursu silindi.");
	}
	
	public void addHomework(String homework) {
		System.out.println(homework+" odevi eklendi."); 
	}
	
	
	
	
	
	
	
	
	

}
