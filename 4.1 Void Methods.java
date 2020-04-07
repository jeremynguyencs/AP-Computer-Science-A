public class Main{
	public static void monthName(int x){
		String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
		System.out.println(months[x-1]);
	}
	
	public static void monthDays(int x){
		int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		System.out.println(days[x-1]);
	}
	
	public static void swap(int a, int b){
		System.out.println(b + " " + a);
	}
	
	public static void realTime(int a){
		System.out.println ("Hours: " + (a / 60 / 60) % 24);
		System.out.println ("Minutes: " + (a / 60) % 60);
		System.out.println ("Seconds: " + a % 60);
	}
	/****NO NEED TO CHANGE MAIN METHOD****/
	public static void main(String[] args){
		System.out.println("monthName() Tests:");
		System.out.print("1:\t monthName(8) prints \"August\". Yours prints ");
		monthName(8);
		System.out.print("2:\t monthName(2) prints \"February\". Yours prints ");
		monthName(2);
		System.out.println();
		
		System.out.println("monthDays() Tests:");
		System.out.print("1:\t monthDays(9) prints \"30\". Yours prints ");
		monthDays(9);
		System.out.print("2:\t monthDays(2) prints \"28\". Yours prints ");
		monthDays(2);
		System.out.println();
		
		System.out.println("swap() Tests:");
		System.out.print("1:\t swap(3,7) prints \"7 3\". Yours prints ");
		swap(3,7);
		System.out.print("2:\t swap(12,4) prints \"4 12\". Yours prints ");
		swap(12,4);
		System.out.println();
		
		System.out.println("realTime() Test:");
		System.out.print("realTime(6342) prints:\nHours: 1\nMinutes: 45\nSeconds: 42\n\nYours prints: \n");
		realTime(6342);
		System.out.println();

	}//end main
}//end class