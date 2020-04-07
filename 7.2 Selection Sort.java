public class Main {
	/*
	 * Implement a selection sort on the array called list.
	 * Prints the sorted values in order with a space
	 * between each word.
	 */
	public static String[] selectionSort(String[] list){
		for (int i = 0; i < list.length; i++){
			int min  = i;
			for (int j = i+1; j < list.length; j++)
				if (list[j].compareTo(list[min]) < 0){
					min = j;				
				}
			String temp = list[i];
			list[i] = list[min];
			list[min] = temp;
		}
		return list;
	}
	
	/*
	 * No need to change the main method. Run to check if your output matches the
	 * sample run.
	 */
	public static void main(String[] args) {
		String[] list = {"against","forms","belief","government","democratic","movement","understanding"};
		String[] sortList = selectionSort(list);
		for (int i=0; i<sortList.length; i++){
			System.out.print(sortList[i] + " ");
		}
		System.out.println();
		
		String[] list2 = {"sort","this","list"};
		String[] sortList2 = selectionSort(list2);
		for (int i=0; i<sortList2.length; i++){
			System.out.print(sortList2[i] + " ");
		}
		System.out.println();
		
		String[] list3 = {"I", "am", "a", "list"};
		String[] sortList3 = selectionSort(list3);
		for (int i=0; i<sortList3.length; i++){
			System.out.print(sortList3[i] + " ");
		}
		System.out.println();
		
		String[] list4 = {"me","too!", "a list"};
		String[] sortList4 = selectionSort(list4);
		for (int i=0; i<sortList4.length; i++){
			System.out.print(sortList4[i] + " ");
		}
		System.out.println();
		
		String[] list5 = { "z","b","c","e","f","i","h","j","u","v","t","w","m","a"};
		String[] sortList5 = selectionSort(list5);
		for (int i=0; i<sortList5.length; i++){
			System.out.print(sortList5[i] + " ");
		}
		System.out.println();
	}
}