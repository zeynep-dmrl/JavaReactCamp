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
					
					System.out.println("Mailinize doðrulama maili gönderilmiþtir.\nLütfen mailinizi doðrulayýn.");
					emailSend(user.getEposta());
					
					this.userDao.add(user);
					if(this.googleService != null) {
						this.googleService.addToGoogle(user.getEposta()+" kullanýcý eklendi.",user);
					}
					
				}else {
					System.out.println("Þifre en az 6 karakter içermelidir!");
				}
				
			}else {
				System.out.println("Maile ait bir kullanýcý var ya da mail eposta formatýna uygun deðildir!"); 
			}
			
		}else {
			System.out.println("Ad ve Soyad en az iki karakter içermelidir!");
		}
	}

	@Override
	public void signIn(String eposta, String password) {
		if(userDao.get(eposta) != null) {
			User temp = userDao.get(eposta) ;
			if(password == temp.getPassword()) {
				System.out.println("Sisteme giriþ yapýldý.");
			}else {
				System.out.println("Kullanýcý sifresi yanlis!");  
			}
			
		}else {
			System.out.println("Kullanýcý mail adresi yanlis!"); 
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
		System.out.println("Mailiniz Dogrulandý.");
		
	}
}
