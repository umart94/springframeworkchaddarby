package springframeworkdemo.model;

import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Student {

	private int id;
	private String firstName;
	private String lastName;
	private boolean active;
	private Address address;
	private String[] languages;
	public int getId() {
		return id;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public boolean isActive() {
		return active;
	}
	public Address getAddress() {
		return address;
	}
	public String[] getLanguages() {
		return languages;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", active=" + active
				+ ", address=" + address + ", languages=" + Arrays.toString(languages) + "]";
	}

	
	
	
}
