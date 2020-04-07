import java.util.*;

class Main {
    public static void main(String[] arg) {
        Scanner scan = new Scanner(System.in);
        ArrayList < String > names = new ArrayList < String > ();
        String input = "";
        while (!input.toUpperCase().equals("STOP")) {
            System.out.println("Enter the next name:");
            input = scan.nextLine();
            if (!input.toUpperCase().equals("STOP")) {
                names.add(titleCase(input));
            }
        }
        insertionSort(names);
        System.out.println(names);
    }

    public static String titleCase(String word) {
        String newWord = "";
        newWord += word.toUpperCase().charAt(0);
        newWord += word.toLowerCase().substring(1);
        return newWord;
    }

    public static void insertionSort(ArrayList < String > list) {
        for (int i = 0; i <= list.size() - 1; i++) { //Insertion sort compares the two values from the start
            String key = list.get(i); // value to be compared
            int temp = i - 1; // the other value that is compared
            while (temp >= 0 && list.get(temp).compareTo(key) > 0) { // looks backwards to see if the temp variable is the greatest variable
                list.set(temp + 1, list.get(temp)); // inserts it to where the key was
                temp--; 
            }
            list.set(temp + 1, key); // key is put to the right of temp variable
        }
    }
}