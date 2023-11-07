package week3.day2;

public class Browser {
	
	String browserName="FireFox";
	float browserVersion= 112.0f;
	
	public void openUrl() {
		System.out.println("Url is opened");
	}
    public void closeBrowser() {
    	System.out.println("Browser is closed");
    	
    }
    public void navigateBack() {
    	System.out.println("Navigating Back");
    	
    }
    
	public static void main(String[] args) {
		Browser object = new Browser();
		object.openUrl();
		object.closeBrowser();
		object.navigateBack();
	

	}

}
