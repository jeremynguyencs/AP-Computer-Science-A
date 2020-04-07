import java.util.ArrayList;
public class Main{
	/*
	 * Returns the number of Strings in the input list that start with the given
	 * letter. Implementation should use linear search, and ignore the case of
	 * the input letter.
	 */
	public static int countLetter(ArrayList<String> list, String letter)
	{
		int count = 0;
		for (int i = 0; i <= list.size()-1; i++){
			if (list.get(i).substring(0,1).equalsIgnoreCase(letter))
				count++;
		}
		return count;
	}
	
	/*
	 * No need to change the main method. Run to check if your output matches the
	 * sample run.
	 */
	public static void main(String str[])
	{

		//Initialize an ArrayList of animals called zoo.
		ArrayList<String> zoo = new ArrayList<String>();
		zoo.add("Zebra");
		zoo.add("Aardvark");
		zoo.add("Emu");
		zoo.add("Hippo");
		zoo.add("Alligator");
		zoo.add("Lion");
		zoo.add("Giraffe");
		zoo.add("Seal");
		zoo.add("Tiger");
		zoo.add("Elephant");

		//Print the contents of the zoo.
		System.out.println(zoo);

		/*
		 * Print the output from calling countLetter with various letters. For
		 * example, countLetter (zoo, "e") should return 2 while
		 * countLetter(zoo, "W") should return 0.
		 */
		System.out.println("A: " + countLetter(zoo, "A"));
		System.out.println("B: " + countLetter(zoo, "B"));
		System.out.println("C: " + countLetter(zoo, "C"));
		System.out.println("L: " + countLetter(zoo, "L"));
		System.out.println("T: " + countLetter(zoo, "T"));

		System.out.println("a: " + countLetter(zoo, "a"));
		System.out.println("b: " + countLetter(zoo, "b"));
		System.out.println("c: " + countLetter(zoo, "c"));
		System.out.println("l: " + countLetter(zoo, "l"));
		System.out.println("t: " + countLetter(zoo, "t"));
	}
}
