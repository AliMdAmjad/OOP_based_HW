package oopExam;

public class TestPhone {

	public static void main(String[] args) {

		System.out.println("\n-------Regular Class Iphone1-------\n");
		Iphone1 iph1 = new Iphone1();
		Iphone1 iph2 = new Iphone1(750, "2000", 'F', false);

		iph1.regularClassInfo();
		Iphone1.youTube();
		iph1.pagerInfo();
		iph1.wakitokiInfo();
		iph1.interfaceInfo();
		iph1.call();
		iph1.message();
		iph1.camera();
		iph1.battery();
		iph1.abstractClassInfo();
		iph1.appleWatchInfo();
		iph1.watchInfo();
		iph1.digitalWatchInfo();
		iph1.watchSeries5Info();

		System.out.println("I bought this phone in " + iph2.getInfo() + ", the price was $" + iph2.getPrice()
				+ ", user's sex: " + iph2.getUser() + ", made in USA: " + iph2.isMadeInUSA());

		System.out.println("\n-------Regular Class Iphone2-------\n");
		Iphone2 iph3 = new Iphone2();
		Iphone2 iph4 = new Iphone2('F');

		iph3.iPhone2Info();
		iph3.iPhone2Info('M');
		iph3.dropBox();

		System.out.println("\n-------Abstra Class AppleWatch-------\n");
		AppleWatch aw = new Iphone1();

		aw.abstractClassInfo();
		aw.appleWatchInfo();
		aw.watchSeries5Info();
		aw.watchInfo();
		aw.digitalWatchInfo();

		System.out.println("\n-------Interface Phone-------\n");
		Phone ph = new Iphone1();

		ph.interfaceInfo();
		ph.call();
		ph.message();
		ph.camera();
		ph.battery();
		Phone.wireless();
		ph.pagerInfo();
		ph.wakitokiInfo();

		System.out.println("\n-------Regular Class Iphone6-------\n");
		Iphone6 iPhone6 = new Iphone6();

		iPhone6.compass();
		iPhone6.materials(55, 350);
		iPhone6.materials(90, 550, "350");
		iPhone6.materials();
		iPhone6.materials(75, "400", 100);
		iPhone6.materials(7, 9, 14);
		Iphone6.materials(15, 20, 33, 40);
		iPhone6.email();
		iPhone6.photos();
		iPhone6.iPhone2Info();
		iPhone6.iPhone2Info('F');
		iPhone6.dropBox();
		iPhone6.regularClassInfo();
		Iphone6.youTube();
		iPhone6.pagerInfo();
		iPhone6.wakitokiInfo();
		iPhone6.interfaceInfo();
		iPhone6.call();
		iPhone6.message();
		iPhone6.camera();
		iPhone6.battery();
		iPhone6.abstractClassInfo();
		iPhone6.appleWatchInfo();
		iPhone6.watchInfo();
		iPhone6.digitalWatchInfo();
		iPhone6.watchSeries5Info();

		System.out.println("\n-------Regular Class ConfiguredIphone6-------\n");
		ConfiguredIphone6 c6 = new ConfiguredIphone6();

		c6.compass();
		c6.materials(55, 350);
		c6.materials(90, 550, "350");
		c6.materials();
		c6.materials(75, "400", 100);
		c6.materials(7, 9, 14);
		ConfiguredIphone6.materials(15, 20, 33, 40);
		c6.email();
		c6.photos();
		c6.iPhone2Info();
		c6.iPhone2Info('F');
		c6.dropBox();
		c6.regularClassInfo();
		ConfiguredIphone6.youTube();
		c6.pagerInfo();
		c6.wakitokiInfo();
		c6.interfaceInfo();
		c6.call();
		c6.message();
		c6.camera();
		c6.battery();
		c6.abstractClassInfo();
		c6.appleWatchInfo();
		c6.watchInfo();
		c6.digitalWatchInfo();
		c6.watchSeries5Info();

		/*
		  The relation between Ipnone1, Ipnone2, Ipnone3, Ipnone4, Ipnone5 and Iphone6
		  is an example of multilevel inheritance, i.e., Iphone6 extends Iphone5,
		  Iphone5 extends Iphone4, Iphone4 extends Iphone2, and Iphone2 extends
		  Iphone1.
		 */
		/*
		  The relation between Ipnone1, Iphone2 and Iphone3 is an example of
		  hierarchical inheritance, i.e., both Iphone2 and Iphone3 are derived from the
		  parent class Iphone1.
		 */
		/*
		  The relation between Ipnone1 and Iphone2 is an example of single inheritance,
		  i.e., Iphone2 extends Iphone1.
		 */

	}

}
