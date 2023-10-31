package my_java;

import java.util.Scanner;

public class circle {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter r");
		float r = sc.nextFloat();
		float Area;
		Area = 3.14f * r * r;
		System.out.println("area is " + Area);

	}

}
