import java.util.ArrayList;

public class Strand {
	// An ArrayList that stores a strand of lights
	private ArrayList <Light> strand = new ArrayList <Light> ();
	
	public Strand() {
		strand.add(new Light());
	}
	public Strand(int n) {
		if (n <= 0) {
			n = 1;
		}
		for (int i = 0; i < n; i++) {
			strand.add(new Light());
		}
	}
	public String toString() {
		String result = "";
		for (Light light: strand) {
			result += light + "\n";
		}
		return result;
	}
	public void setColor(String c) {
		for (Light light: strand) {
			light.setColor(c);
		}
	}
	public void setMulti() {
		String[] colors = {"red","green","blue"};
		int colorIndex = 0;
		for (Light light: strand) {
			light.setColor(colors[colorIndex++%3]);
		}
	}
	public void turnOn() {
		for (Light light: strand) {
			if (!light.isOn()) {
				light.flip();
			}
		}
	}
	public void turnOff() {
		for (Light light: strand) {
			if (light.isOn()) {
				light.flip();
			}
		}
	}
	public void burnOut(int i) {
		strand.get(i).burnOut();
	}

	//********************************************************************************
	//--------------------------DO NOT CHANGE THE CODE BELOW------------------------
	//********************************************************************************
	public static void main(String[] args) {
		// *************************************************************************
		// 1. Test Strand()
		// *************************************************************************
		System.out.println("1. Test the default constructor Strand()");
		Strand strand1 = new Strand();
		if (strand1.strand.size() == 1) System.out.println("*** PASS: Strand() creates a list of size 1");
		else System.out.println("*** FAIL: Strand() creates a list of size " + strand1.strand.size() + ", when a list of size 1 is expected.");

		// ***********************************
		// 2. Test Strand(n)
		// ***********************************
		System.out.println("\n2. Test the constructor Strand(n)");
		// Try to create a strand of lights with 0 bulbs
		Strand emptyStrand = new Strand(0);
		if (emptyStrand.strand.size() == 1) System.out.println("*** PASS: Strand(0) creates a list of size 1");
		else System.out.println("*** FAIL: Strand(0)  creates a list of size " + emptyStrand.strand.size() + ", when a list of size 1 is expected.");
		// Try to create a strand of lights with a negative number
		Strand negativeStrand = new Strand( - 7);
		if (negativeStrand.strand.size() == 1) System.out.println("*** PASS: Strand(-7) creates a list of size 1");
		else System.out.println("*** FAIL: Strand(-7) creates a list of size " + negativeStrand.strand.size() + ", when a list of size 1 is expected.");
		// Try to create a strand of lights with a positive number
		Strand strandWithFiveBulbs = new Strand(5);
		if (strandWithFiveBulbs.strand.size() == 5) System.out.println("*** PASS: Strand(5) creates a list of size 5");
		else System.out.println("*** FAIL: Strand(5) creates a list of size " + strandWithFiveBulbs.strand.size() + ", when a list of size 5 is expected.");
		// Verify that all the light bulbs are initialized properly
		boolean success = true;
		for (Light bulb: strandWithFiveBulbs.strand) {
			if (! (bulb.isOn() && bulb.getColor().equals("white"))) {
				success = false;
			}
		}
		if (strandWithFiveBulbs.strand.size() > 0 && success) {
			System.out.println("*** PASS: Strand(5) initialized bulbs correctly");
		}
		else {
			System.out.println("*** FAIL: Strand(5) did not initialize bulb(s) correctly");
		}

		// ***********************************
		// 3. Test setColor(String)
		// ***********************************
		System.out.println("\n3. Test setColor(String)");
		// All of the bulbs in our strandWithFiveBulbs are white. Set them to
		// green.
		strandWithFiveBulbs.setColor("green");
		success = true;
		for (Light light: strandWithFiveBulbs.strand) {
			if (!light.getColor().equals("green")) success = false;
		}
		if (strandWithFiveBulbs.strand.size() > 0 && success) System.out.println("*** PASS: setColor worked as expected (green test)");
		else System.out.println("*** FAIL: setColor did not work as expected (green test)");
		// Now try to set them to a color that is not supported.  This should 
		// cause all the bulbs to be set back to white.
		strandWithFiveBulbs.setColor("pink");
		success = true;
		for (Light light: strandWithFiveBulbs.strand) {
			if (!light.getColor().equals("white")) success = false;
		}
		if (strandWithFiveBulbs.strand.size() > 0 && success) System.out.println("*** PASS: setColor worked as expected (pink test)");
		else System.out.println("*** FAIL: setColor did not work as expected (pink test)");

		// ***********************************
		// 4. Test turnOff()
		// ***********************************
		System.out.println("\n4. Test turnOff()");
		strand1.turnOff();
		if (strand1.strand.size() > 0 && !strand1.strand.get(0).isOn()) {
			System.out.println("*** PASS: turnOff() worked as expected");
		}
		else {
			System.out.println("*** FAIL: turnOff() did not work as expected");
		}

		// ***********************************
		// 5. Test turnOn()
		// ***********************************
		System.out.println("\n5. Test turnOn()");
		strand1.turnOn();
		if (strand1.strand.size() > 0 && strand1.strand.get(0).isOn()) {
			System.out.println("*** PASS: turnOn() worked as expected");
		}
		else {
			System.out.println("*** FAIL: turnOn() did not work as expected");
		}

		// ***********************************
		// 6. Test burnOut(int)
		// ***********************************
		System.out.println("\n6. Test burnOut(n)");
		strand1.burnOut(0);
		if (strand1.strand.get(0).toString().equals("off white\tburnt out")) {
			System.out.println("*** PASS: burnOut(0) works as expected.");
		}
		else {
			System.out.println("*** FAIL: burnOut(0) does not work as expected.");
		}
		// ************************************
		// 7. Test setMulti()
		// ************************************
		System.out.println("\n7. Test setMulti()");
		Strand strand2 = new Strand(9);
		strand2.setMulti();
		boolean check = true;
		for (int i = 0; i < strand2.strand.size(); i++) {
			Light s = strand2.strand.get(i);
			if (i % 3 == 0 && s.getColor().compareTo("red") != 0) {
				check = false;
			}
			else if (i % 3 == 1 && s.getColor().compareTo("green") != 0) {
				check = false;
			}
			else if (i % 3 == 2 && s.getColor().compareTo("blue") != 0) {
				check = false;
			}
		}
		if (check) System.out.println("*** PASS: The color is set as expected.");
		else {
			System.out.print("*** FAIL: The color is set not as expected.");
		}
		System.out.println("\n" + strand2);

	}
}