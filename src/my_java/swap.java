package my_java;

public class swap {

	public static void main(String[] args) {
		 int x = 5;
		 int y = 6;

		    System.out.println("Before swapping: x = " + x + " y = " + y);

		    
		   // x = x * y;                     // x is now 2
		   // y = x / y;                     // y is now 1
		    //x = x / y;                     // x is now 2
		    x=x+y;
		    y=x-y;
		    x=x-y;

		    System.out.println("After swapping: x = " + x + " y = " + y);
		  }
		}


	


