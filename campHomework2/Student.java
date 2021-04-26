package campHomework2;

public class Student {
	
	public Student(){
		System.out.println("Student created."); 
			
		}
	
	public Student(String name,String surname,String email){
		
		this();
		this.name = name;
		this.surname = surname;
		this.email = email;
	}
	
	
	String name;
	String surname;
	String email;
	

}
