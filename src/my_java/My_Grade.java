package my_java;

import java.util.Scanner;

public class My_Grade {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter grade");
		int marks=scanner.nextInt();

		if (marks>=70 && marks<=100) {
			System.out.println("A");
		}
		else if (marks>=60 && marks<70) {
			System.out.println("B");
		}
		else if (marks>=50 && marks<60) {
			System.out.println("C");
		}
		else if(marks<=40 && marks>=0) {
			System.out.println("Fail");
		}
		else {
			System.out.println("Enter correct marks");
		}


	}

}
