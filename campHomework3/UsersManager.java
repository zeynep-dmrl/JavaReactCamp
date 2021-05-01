package campHomework3;

public class UsersManager {
	
	public void add(Users user) {
		System.out.println(user.getFirstname()+" eklendi."); 
		
	}
	
	public void addMultiple(Users[] users) {
		for (Users user: users) {
			add(user);
		}
	}

	public void display(Users[] users) {
		
		for (Users user: users) {
			System.out.println(user.getFirstname()+" "+user.getLastname()+" "+user.getEmail()); 
		}
	}


	
	
	
}
	
	


