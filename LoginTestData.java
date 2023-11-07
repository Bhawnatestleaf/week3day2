package week3.day2;

public class LoginTestData extends TestData{
	
	public void enterUsername() {
		System.out.println("Enter your username");
	}
    
	public void enterPassword() {
		System.out.println("Enter your password");
	}
	public static void main(String[] args) {
		LoginTestData object = new LoginTestData();
		object.enterUsername();
		object.enterPassword();
		object.enterCredentials();
		object.navigateToHomePage();

	}

}
