package week3.day2;

public class TestData {
	
	public void enterCredentials(){
		System.out.println("Enter your credentials");
	}
	 public void navigateToHomePage() {
		 System.out.println("Navigate to home page");
	 }

	public static void main(String[] args) {
	TestData object = new TestData();
	object.enterCredentials();
	object.navigateToHomePage();

	}

}
