
public class Customer {
	String firstName, lastName, password;
	int socialSecurity; // might be able to use byte or smaller #

	public Customer(String firstName, String lastName, String password, int socialSecurity) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.socialSecurity = socialSecurity;
	}
}
