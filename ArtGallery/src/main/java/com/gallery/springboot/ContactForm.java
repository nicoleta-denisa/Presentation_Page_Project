package com.gallery.springboot;

public class ContactForm {
	public String firstName;
	public String lastName;
	public String email;
	public String message;
	public ContactForm(String firstName, String lastName, String email, String message) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.message = message;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return "ContactForm [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", message="
				+ message + "]";
	}
	
	
	
}
