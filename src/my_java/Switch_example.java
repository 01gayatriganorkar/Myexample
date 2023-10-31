package my_java;

import java.util.Scanner;

public class Switch_example {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("choose an operation\n" +"+Add\n - Sub \n" + "/ div \n * mul");
		String op = sc.nextLine();
		System.out.println("Enter Two no.");
		int a =sc.nextInt();
		int b =sc.nextInt();
		switch(op)
		{
		case "+" :
			System.out.println("sum is"+(a+b));
			break;
		case "-" :
			System.out.println("sub is"+(a-b));
			break;
		case "/" :
			System.out.println("sum is"+(a/b));
			break;
		case "*" :
			System.out.println("sum is"+(a*b));
			break;
			default:
				System.out.println("Enter right op");
				
				
		}
	}

}
