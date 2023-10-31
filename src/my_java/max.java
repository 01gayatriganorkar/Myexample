package my_java;

import java.util.Scanner;

public class max {

	public static void main(String[] args) 
	{
		int a,b,c;
		Scanner sc = new Scanner(System.in);
				System.out.println("enter number");
				 a =sc.nextInt();
				 System.out.println("enter number");
				  b =sc.nextInt();
				 System.out.println("enter number");
				  c =sc.nextInt();
				 if (a>b&&a>c) {
					 System.out.println("max Number is"+a);
					
				}else if(b>a&&b>c) {
					System.out.println("max Number is"+b);

	}else {
		System.out.println("max number is"+c);
	}

	}
}


