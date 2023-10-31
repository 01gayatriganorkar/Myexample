package my_java;

public class pattern {

	public static void main(String[] args) {
		 int n = 6; // Define the number of rows
	        printPattern(n);
	    }

	    public static void printPattern(int n) {
	        for (int i = 1; i <= n; i++) {
	            for (int j = 1; j <= n - i; j++) {
	                System.out.print(" "); // Print spaces
	            }
	            // Inner loop to print numbers
	            for (int j = 1; j <= i; j++) {
	                System.out.print(i + " ");
	            }
	            // Print a new line for each row
	            System.out.println();
	        }
	    }
	}
	




