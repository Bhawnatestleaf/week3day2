package week3.day2;

public class Safari extends Browser{
	
	public void readerMode() {
		System.out.println("Reader mode is activated");
	}
	
	public void fullScreenMode(){
		System.out.println("Full screen is activated");
	}

	public static void main(String[] args) {
		
	Safari object = new Safari();
	object.openUrl();
	object.closeBrowser();
	object.navigateBack();
	object.readerMode();
	object.fullScreenMode();
	

	}

}
