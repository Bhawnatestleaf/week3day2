package week3.day2;

public class Edge extends Browser {
	
	public void takeSnap() {
		System.out.println("SnapShot");
	}
    public void clearCoockies() {
    	System.out.println("Cookies are cleared");
    }
    
	public static void main(String[] args) {
	Edge object = new Edge();
	object.openUrl();
	object.closeBrowser();
	object.navigateBack();
	object.takeSnap();
	object.clearCoockies();

	}

}
