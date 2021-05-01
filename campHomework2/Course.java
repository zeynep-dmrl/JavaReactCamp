package campHomework2;

public class Course {
	
	public Course(){
		
	}
	
	public Course(int id,String name,String instructor,String detail,String price){
		
		this();
		this.id = id;
		this.name = name;
		this.instructor = instructor;
		this.detail = detail;
		this.price = price;
	}
	
	int id;
	String name;
	String instructor;
	String detail;
	String price;
	Student[] students;
	
	
	public void write(Student[] students) {
		for(Student std :students ) {
			System.out.println(std.name+"\t"+std.surname+"\t"+std.email); 
		}
	}
	
	
}
