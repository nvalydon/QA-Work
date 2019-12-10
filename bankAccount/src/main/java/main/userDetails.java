package main;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class userDetails {

	@Id
	@GeneratedValue
	private Long id;

	private String firstName;
	private String lastName;
	private String accountNumber;

	public userDetails() {
		super();

	}

	public userDetails(String firstName, String lastName, String accountNumber) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.accountNumber = accountNumber;

	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	
	
	/*
	 * Gen acc num = new acc num();
	 *return acc num;
	 * 
	 * 
	 * 
	 * 
	 */
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
