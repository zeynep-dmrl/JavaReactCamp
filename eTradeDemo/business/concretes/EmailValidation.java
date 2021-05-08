package eTradeDemo.business.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation {
	
	private static final String regex = "^(.+)@(.+)$";
	
	public boolean checkEmail(String eposta) {
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(eposta);
		if(matcher.matches()) return true;
		
		return false;
	}

}
