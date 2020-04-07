import java.util.Scanner;
import java.util.ArrayList;

public class Main{
	public static void main(String[] args){
        ArrayList <String> bb = new ArrayList <String> ();
    	Scanner scan = new Scanner(System.in);
    	System.out.println("Please enter words, enter STOP to stop the loop.");
    	while (true){
    		String string = scan.nextLine();
    		if (string.equals("STOP")){
    			break;
    		}
    		bb.add(string);
    	}
		System.out.println(bb.size());
        System.out.println(bb);
        if (bb.size() > 2){
        	bb.remove(0);
        	bb.remove(bb.size()-1);
        }
        System.out.println(bb);
        
	}//end main
}//end class