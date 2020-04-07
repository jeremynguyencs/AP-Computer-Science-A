public class Main {
    /******QUESTION 1******/
    public static double ave(int[] a) {
        double avg = 0;
        int x = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] >= 0) {
                avg += a[i];
                x++;
            }
        }
        return ((double)(avg / x));
    } //end ave method

    /******QUESTION 2******/
    public static int findX(int[] a, int x) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == x)
                return i;
        }
        return (-1);
    } //end findX method

    /******QUESTION 3******/
    public static boolean evensOnly(int[] a) {
        int x = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0)
                x++;
            if (x == a.length - 1)
                return true;
        }
        return false;
    } //end evensOnly method

    /******QUESTION 4******/
    public static void flipSign(int[] a) {
        for (int i = 0; i < a.length; i++) {
            a[i] = a[i] * -1;
        }
    } //end flipSign method

    /******QUESTION 5******/
    public static boolean noRepeats(int[] a) {
        int c = 0;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] == a[i + 1]) {
                c++;
            }
            if (c > 0) {
                return false;
            }
        }
        return true;
    } //end noRepeats method

  public static void main(String[] args) {
  	int[] ex = {-1,2,6,-4,-4,0};
  	System.out.println("---------------ave() Check--------------");
  	System.out.println("Your ave(ex) returns " + ave(ex)+".\nDo the math to see if true.\n");
  	System.out.println("--------------findX() Check-------------");
  	System.out.println("Your findX(ex,2) returns " + findX(ex,2) + ". Answer should be 1.");
  	System.out.println("Your findX(ex,9) returns " + findX(ex,9) + ". Answer should be -1.\n");
  	System.out.println("----------evensOnly() Check-------------");
  	System.out.println("Your evensOnly(ex) returns " + evensOnly(ex) + ". Answer should be false.\n");
  	System.out.println("-----------flipSign() Check-------------");
  	System.out.print("Your flipSign(ex) changes ex to {");
  	flipSign(ex);
  	for (int i=0;i<ex.length-1;i++){
  		System.out.print(ex[i]+",");
  	}
  	System.out.println(ex[ex.length-1]+"}.\nAnswer should be {1,-2,-6,4,4,0}.\n");
  	System.out.println("-----------noRepeats() Check------------");
  	System.out.println("Your noRepeats(ex) returns " + noRepeats(ex) + ". Answer should be false.");
  }//end main method
}//end Main class