import java.util.Scanner;
public class lab2{
    public static void Main(String args[]){
        Scanner scan = new Scanner(System.in);
        
        //declares all the necessary conversion factors
        final int SECONDS = 60;
        final int MINUTES = 60;
        final int DAY = 24;
        final int YEAR = 365;
        
        //input
        System.out.println("Please enter the time of travel in seconds:");
        int travelTime = scan.nextInt();
        
        System.out.println("Please enter the speed in miles per hour:");
        int speed = scan.nextInt();
        
        //converts to its base unit with division, then uses modulus to find remainder
        int seconds = travelTime % MINUTES;
        int minutes = (travelTime / SECONDS) % MINUTES;
        int hours = (travelTime / SECONDS / MINUTES) % DAY;
        int days = (travelTime / SECONDS / MINUTES / DAY) % YEAR;
        int years = travelTime / SECONDS / MINUTES / DAY / YEAR;

        
        //converts to hours and then multiples by its miles per hour to get the distance
        double distance = ((double)travelTime / SECONDS / MINUTES) * speed;
        
        
        //output
        System.out.println("You have been traveling for: " + years + " years " + days + " days " + hours + " hours " + minutes + " minutes " + seconds + " seconds.");
        
        System.out.println("Your distance traveled is: " + distance + " miles.");
        
        }
}
