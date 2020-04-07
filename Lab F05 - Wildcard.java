import java.util.Scanner;
public class Wild {
    public static void Main(String args[]) {
        Scanner scan = new Scanner(System.in);
        
        //declares all inputs strings
        System.out.println("Enter the first String:: ");
        String firstString = scan.nextLine();
        System.out.println("Enter the replacement String:: ");
        String secondString = scan.nextLine();
        
        //declares all counts for comparison
        int starCount = 0;
        int invalidChar = 0;
        
        //declares the new string 
        String newString = "";
        
        //checks each character
        for (int i = 0; i < firstString.length(); i++) {
            //checks if each character is a letter, number, space, or tab
            if (Character.isDigit(firstString.charAt(i)) || Character.isLetter(firstString.charAt(i)) || firstString.charAt(i) == ' ' || firstString.charAt(i) == '\t' || firstString.charAt(i) == '*') {
                //adds new string to * in old string
                if (firstString.charAt(i) == '*') {
                    newString = firstString.substring(0, i) + secondString + firstString.substring(i + 1, firstString.length());
                    //counts the amounts of star in case there's too many
                    starCount++;
                }
            } else {
                //checks if it's an invalid character
                invalidChar++;
            }
        }

        if (starCount == 0) {
            System.out.println("no *");
        } else if (starCount != 1 || invalidChar > 0) {
            System.out.println("Error: Incorrect characters");
        } else {
            System.out.println(newString);
        }
    }
}