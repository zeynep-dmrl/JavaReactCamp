package eTradeDemo.business.concretes;

import eTradeDemo.business.abstracts.CheckService;
import eTradeDemo.business.abstracts.UserService;
import eTradeDemo.business.abstracts.VerifyService;
import eTradeDemo.core.abstracts.GoogleService;
import eTradeDemo.dataAccess.abstracts.UserDao;
import eTradeDemo.entities.concretes.User;

public class UserManager extends EmailValidation implements UserService, CheckService,VerifyService{
	
	private UserDao userDao;
	private GoogleService googleService;
	
	
	public UserManager(UserDao userDao) {
		this.userDao = userDao;
	}

	public UserManager(UserDao userDao, GoogleService googleService) {
		this.userDao = userDao;
		this.googleService = googleService;
	}

	@Override
	public void signUp(User user) {
		/*
		 * name,surname
		 * email
		 * password 
		 */
		if(checkNameAndSurname(user.getFirstName(), user.getLastName()) ) {
			if( (userDao.get(user.getEposta()) == null) && (checkEmail(user.getEposta())) ) {
				
				if(checkIfPasswordLenght(user.getPassword())) {
					
					System.out.println("Mailinize do�rulama maili g�nderilmi�tir.\nL�tfen mailinizi do�rulay�n.");
					emailSend(user.getEposta());
					
					this.userDao.add(user);
					if(this.googleService != null) {
						this.googleService.addToGoogle(user.getEposta()+" kullan�c� eklendi.",user);
					}
					
				}else {
					System.out.println("�ifre en az 6 karakter i�ermelidir!");
				}
				
			}else {
				System.out.println("Maile ait bir kullan�c� var ya da mail eposta format�na uygun de�ildir!"); 
			}
			
		}else {
			System.out.println("Ad ve Soyad en az iki karakter i�ermelidir!");
		}
	}

	@Override
	public void signIn(String eposta, String password) {
		if(userDao.get(eposta) != null) {
			User temp = userDao.get(eposta) ;
			if(password == temp.getPassword()) {
				System.out.println("Sisteme giri� yap�ld�.");
			}else {
				System.out.println("Kullan�c� sifresi yanlis!");  
			}
			
		}else {
			System.out.println("Kullan�c� mail adresi yanlis!"); 
		}
		
		
	}

	@Override
	public boolean checkIfPasswordLenght(String password) {
		if(password.length() >= 6) return true;
		return false;
	}

	@Override
	public boolean checkNameAndSurname(String firstName,String lastName) {
		if(firstName.length() >=2 && lastName.length() >=2) return true;
		return false;
			
	}

	@Override
	public void emailSend(String eposta) {
		System.out.println("Mailiniz Dogruland�.");
		
	}
}
