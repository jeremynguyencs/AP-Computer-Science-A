public class Main{
	/***Write the methods below***/
    public static int sum(int[] x){
        int sum = 0;
        for (int i = 0; i < x.length; i++){
        	sum += x[i];
        }
        return sum;
    }
    
    public static double average(int[] x){
        int sum = 0;
        for (int i = 0; i < x.length; i++){
        	sum += x[i];
        }
        
        return sum/((x.length)/1.0);
    }
    
    public static int findMax(int[] x){
        int max = x[0];
        for (int i = 0; i < x.length; i++){
        	if (x[i] > max){
        		max = x[i];
        	}
        }
        return max;
    }
    
    public static int findMin(int[] x){
        int min = x[0];
        for (int i = 0; i < x.length; i++){
        	if (x[i] < min){
        		min = x[i];
        	}
        }
        return min;
    }
    
    public static int sumEven(int[] x){
        int sum = 0;
        for (int i = 0; i < x.length; i++){
	        if (x[i] % 2 == 0){
	        	sum += x[i];
	        }	
        }
        return sum;
    }
    
    public static boolean allPositive(int[] x){
        for (int i = 0; i < x.length; i++){
	        if (x[i] < 0){
	        	return false;
	        }
        }
        return true;
    }
    
	/**No Need to Change the Main Method**/
	public static void main(String[] args){
		int[] arr = {5,4,3,12,-5,18,-42,6};
		System.out.println("*******sum() Test*******");
		System.out.println("Given array: {5,4,3,12,-5,18,-42,6}");
		int total = sum(arr);
		System.out.println("Answer: 1");
		System.out.println("Your result: " + total+"\n");
		
		System.out.println("*****average() Test*****");
		System.out.println("Given array: {5,4,3,12,-5,18,-42,6}");
		double mean = average(arr);
		System.out.println("Answer: 0.125");
		System.out.println("Your result: " + mean+"\n");
		
		System.out.println("*****findMax() Test*****");
		System.out.println("Given array: {5,4,3,12,-5,18,-42,6}");
		int max = findMax(arr);
		System.out.println("Answer: 18");
		System.out.println("Your result: " + max+"\n");
		
		System.out.println("*****findMin() Test*****");
		System.out.println("Given array: {5,4,3,12,-5,18,-42,6}");
		int min = findMin(arr);
		System.out.println("Answer: -42");
		System.out.println("Your result: " + min+"\n");
		
		System.out.println("*****sumEven() Test*****");
		System.out.println("Given array: {5,4,3,12,-5,18,-42,6}");
		int evenTotal = sumEven(arr);
		System.out.println("Answer: -2");
		System.out.println("Your result: " + evenTotal+"\n");
		
		System.out.println("*****allPositive() Test*****");
		System.out.println("Given array: {5,4,3,12,-5,18,-42,6}");
		boolean check = allPositive(arr);
		System.out.println("Answer: false");
		System.out.println("Your result: " + check+"\n");
	}//end main
}//end class