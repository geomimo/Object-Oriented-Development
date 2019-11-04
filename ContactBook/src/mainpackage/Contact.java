package mainpackage;

import java.util.UUID;

public class Contact {

	private UUID id;
	private String name;
	private String phoneNumber;
	private String email;
	private String address;
	
	//Constructors, getters/setters.
	
	public Contact() {
		this.id = UUID.randomUUID();
	}
	
	//A 128-bit unique identifier.
	public Contact setId(UUID id) {
		this.id = id;
		return this;
	}
	
	public Contact setName(String name) {
		this.name = name;
		return this;
	}
	
	public Contact setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
		return this;
	}
	
	public Contact setEmail(String email) {
		this.email = email;
		return this;
	}
	
	public Contact setAddress(String address) {
		this.address = address;
		return this;
	}

	public UUID getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getAddress() {
		return address;
	}
	
}
