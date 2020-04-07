import java.util.Scanner;

public class TweetTester{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        //inputs a tweet
        System.out.println("Please enter a tweet: ");
        String tweet= scan.nextLine();

        //checks if tweet is less or equal to 140 characters
        if (tweet.length() <= 140) {
            System.out.println("Length correct");

            int hashtagCount = 0;
            int mentionCount = 0;
            int linkCount = 0;

            // iterates through the entire tweet character by character
            for (int i = 0; i < tweet.length(); i++){

                // checks if any character starts with # and if the character following it is a non-space or non-tab character, add 1 to the hashtag count.
                if (tweet.charAt(i) == '#' && i+2 <= tweet.length()){ //this is to prevent overflow if the # is at the end of the string
                    if (tweet.charAt(i+1) != ' ' && tweet.charAt(i+1) != '\t') {
                        hashtagCount++;
                    }
                }

                // checks if any characters start with @ and if the character following it is a non-space or non-tab character, add 1 to the mention count.
                if (tweet.charAt(i) == '@' && i+2 <= tweet.length()){
                    if (tweet.charAt(i+1) != ' ' && tweet.charAt(i+1) != '\t')  {
                        mentionCount++;
                    }
                }

                // checks if any characters start with h or H and see if they continue on to form "http://". If they do, add 1 to the link count.
                if (tweet.charAt(i) == 'h' || tweet.charAt(i) == 'H'){
                    if (tweet.substring(i, i + 7).equalsIgnoreCase("http://")) {
                        linkCount++;
                    }
                }

            }

            System.out.println("Number of Hashtags: " + hashtagCount);
            System.out.println("Number of Mentions: " + mentionCount);
            System.out.println("Number of Links: " + linkCount);
        } else {
            //this finds how many excess characters it has if it has more than 140 characters
            System.out.println("Excess Characters: " +(tweet.length()-140));
        }
    }
}
