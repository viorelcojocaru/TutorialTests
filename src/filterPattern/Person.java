package filterPattern;

import filterPattern.colectii.Gender;
import filterPattern.colectii.MaritalStatus;

public class Person {

	private String firstName;
	private String lastName;
	private int age;
	private Gender gender;
	private MaritalStatus maritalStatus;
	
	public Person(String firstName, String lastName, int age, Gender gender,
			MaritalStatus maritalStatus) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.gender = gender;
		this.maritalStatus = maritalStatus;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public MaritalStatus getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(MaritalStatus maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

}
