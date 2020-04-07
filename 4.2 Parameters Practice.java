public class Main{
	/*Write the methods below*/
    public static void upper(String[] arr) {
	    for (int i =0; i < arr.length; i++) {
	        arr[i] = arr[i].toUpperCase();
	    }
	}
    public static void randomize(int[] arr) {
	    for (int i =0; i < arr.length; i++) {
	        arr[i] = (int) (Math.random()*89) + 10;
	    }
	}
	
    public static void printIt(int[] arr) {
	    for (int i =0; i < arr.length; i++) {
	        System.out.print(arr[i]);
	    }
	}

    public static void reverse(int[] a){
		int c = a.length-1;
		int temp = 0;
		for (int i=0; i <(a.length/2); i++){
			temp = a[i];
			a[i] = a[c];
			a[c] = temp;
			c--;
		}
    }
    
    public static void insertValue(int[] arr, int b, int c) {
		for(int i = (arr.length-1); i > c; i--){
		        arr[i]= arr[(i-1)];
		}
		arr[c] = b;
	}
	
	/*NO NEED TO CHANGE THE MAIN METHOD BELOW*/
	public static void main(String[] args){
		//***upper() test case***//
		String[] ani={"dog","CAT","elephant","oWl","Hippo"};
		System.out.println("upper() Test:");
		System.out.print("Original array: ");
		for(int i=0;i<ani.length;i++){
			System.out.print(ani[i]+" ");
		}
		System.out.println("\nAnswer:\t\tDOG CAT ELEPHANT OWL HIPPO");
		upper(ani);
		System.out.print("Your result:\t");
		for(int i=0;i<ani.length;i++){
			System.out.print(ani[i]+" ");
		}
		
		//***randomize() & printIt() test case***//
		int[] arr = new int[(int)(Math.random()*12)+1];
		randomize(arr);
		System.out.println("\n\nrandomize() Test:");
		System.out.print("Your result:\t");
		printIt(arr);
		System.out.println("\nCheck all values if they're between 10-99.");
		
		//***reverse() test case***//
		int[] nums = {3,-5,8,12,9,0};
		System.out.println("\nreverse() Test:");
		System.out.print("Original array: ");
		printIt(nums);
		reverse(nums);
		System.out.println("\nAnswer:\t\t0 9 12 8 -5 3");
		System.out.print("Your result:\t");
		printIt(nums);
		
		//***insertValue() test case***//
		System.out.println("\n\ninsertValue() Test:");
		System.out.println("Inserting 100 at index 3...");
		System.out.print("Original array: ");
		printIt(nums);
		insertValue(nums,100,3);
		System.out.println("\nAnswer:\t\t0 9 12 100 8 -5");
		System.out.print("Your result:\t");
		printIt(nums);
		System.out.println();
	}//end main
}//end class