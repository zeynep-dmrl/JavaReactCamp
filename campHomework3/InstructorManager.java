package campHomework3;

public class InstructorManager extends UsersManager{
	
	@Override
	public void add(Users user) {
		System.out.println(user.getFirstname()+" egitmen eklendi");
	}
	
	public void addCourse(Instructor ýnstructor) {
		System.out.println(ýnstructor.givenCourse+" kursu baslatýldý."); 
	}
	
	public void deleteCourse(Instructor ýnstructor) {
		System.out.println(ýnstructor.givenCourse+":"+ýnstructor.getCourseId()+" kursu silindi.");
	}
	
	public void addHomework(String homework) {
		System.out.println(homework+" odevi eklendi."); 
	}
	
	
	
	
	
	
	
	
	

}
