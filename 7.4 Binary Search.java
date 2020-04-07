public class Main{
	public static boolean isSorted(int[] a){
		if (a.length > 1) {
            for (int i = 1; i < a.length; i++) {
                if (a[i - 1] > a[i]) {
                    return false;
                }
            }
        }
        return true;
	}
	public static int binarySearch(int[] a, int b) {
	    if (isSorted(a)){
	        int start = 0;
	        int end = a.length - 1;
	        while (start <= end) {
	            int mid = (start + end) / 2;
	            if (b == a[mid]) {
	                return mid;
	            }
	            if (b < a[mid]) {
	                end = mid - 1;
	            } else {
	                start = mid + 1;
	            }
	        }
	        return -1;
	    } else {
	    	return -1;
	    }
	}

	public static void main(String[] arg){
		int[] list1 = {-10,12,14,15,36,108};
		int[] list2 = {-4,0,5,10,-18,21,26};
		System.out.println("isSorted(list1) returns " + isSorted(list1));
		System.out.println("isSorted(list2) returns " + isSorted(list2));
		int loc = binarySearch(list1, 15);
		System.out.println("15 is located at index " + loc + " in list1");
		loc = binarySearch(list1,100);
		System.out.println("100 is located at index " + loc + " in list1");
		loc = binarySearch(list1,12);
		System.out.println("12 is located at index " + loc + " in list1");
		loc = binarySearch(list1,0);
		System.out.println("0 is located at index " + loc + " in list1");
		
	}
}