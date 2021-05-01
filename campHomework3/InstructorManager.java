package campHomework3;

public class InstructorManager extends UsersManager{
	
	@Override
	public void add(Users user) {
		System.out.println(user.getFirstname()+" egitmen eklendi");
	}
	
	public void addCourse(Instructor ınstructor) {
		System.out.println(ınstructor.givenCourse+" kursu baslatıldı."); 
	}
	
	public void deleteCourse(Instructor ınstructor) {
		System.out.println(ınstructor.givenCourse+":"+ınstructor.getCourseId()+" kursu silindi.");
	}
	
	public void addHomework(String homework) {
		System.out.println(homework+" odevi eklendi."); 
	}
	
	
	
	
	
	
	
	
	

}
