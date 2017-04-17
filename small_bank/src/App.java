/*Okay, you've made something simple...
 * you don't want to really be able to manipulate the customer class from the app itself
 * it's good that customer and account are seperate
 * you could also abstract account
 * and from there create children accounts: savings, checking
 * If in there the App is customer facing...
 * you want the person to be able to make an account
 * or access their own account.
 * they'll need a password
 * 
 * if you bring in the context of a person opening / closing account
 * you should either do something with Scanner. or you might need to use Customer class directly,
 * Customer.newAccount().... or Customer.accessAccount
 * there are possiblities...
 * */

public class App {
	public static void main(String[] args) {
		Customer nancy = new Customer("Nancy", "Drew", "password", 1234);
		// you shouldn't be able to directly access Customer object in the App
		// you should be able to access Customer, not be able to access account directly.
		
		Account account = new Account(nancy, 1000);
		account.returnBalance();
		
		account.withDrawl(4000);
		account.returnBalance();
		
		account.addFunds(8000);
		account.returnBalance();
		
		account.withDrawl(4000);
		account.returnBalance();
		
	}

}
