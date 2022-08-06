package oopExam;

public class Iphone2 extends Iphone1 {

	public char userOfIphone2 = 'F';

	public Iphone2() {
		super();
		super.name = "Tahira";
		super.regularClassInfo();
		super.youTube();
		super.pagerInfo();
		System.out.println("The name of the Iphone1 user is " + name);
		System.out.println("The gender of the Iphone2 user is " + userOfIphone2);
	}

	public Iphone2(char userOfIphone2) {
		super(750, "2000", 'F', false);
		this.userOfIphone2 = userOfIphone2;

	}

	public void iPhone2Info() {
		super.name = "Taha";
		super.wakitokiInfo();
		super.interfaceInfo();
		super.call();
		super.message();
		super.camera();
		System.out.println("The name of the Iphone2 user is " + name);
	}

	public void iPhone2Info(char userOfIphone2) {
		super.appleWatchInfo();
		super.watchInfo();
		super.digitalWatchInfo();
		System.out.println("The gender of the Iphone2 user is " + userOfIphone2);
	}

	public void dropBox() {
		System.out.println("Dropbox is a popular cloud storage system");
	}

}
