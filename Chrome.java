package week3.day2;

public class Chrome extends Browser {

	public void openIncognito() {
		System.out.println("openincognito");
	}
		
	
	public void clearCache(){
		System.out.println("cache is cleared");
	}
	

	public static void main(String[] args) {
		Chrome object = new Chrome();
		
		object.openUrl();
		object.closeBrowser();
		object.openIncognito();
		object.navigateBack();
		object.clearCache();
	}

}
