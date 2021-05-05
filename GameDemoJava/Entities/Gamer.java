package Entities;

import java.util.Date;

public class Gamer {
	
	
	private String firstName;
	private String lastName;
	private String nationaltyId;
	private Date birthOfDate;
	
	
	public Gamer() {
		
	}
	public Gamer(String firstName, String lastName, String nationaltyId, Date birthOfDate) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.nationaltyId = nationaltyId;
		this.birthOfDate = birthOfDate;
	}
	
	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getNationaltyId() {
		return nationaltyId;
	}
	public void setNationaltyId(String nationaltyId) {
		this.nationaltyId = nationaltyId;
	}
	public Date getBirthOfDate() {
		return birthOfDate;
	}
	public void setBirthOfDate(Date birthOfDate) {
		this.birthOfDate = birthOfDate;
	}
	

}
