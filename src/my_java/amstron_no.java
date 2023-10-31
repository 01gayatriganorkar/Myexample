package my_java;

import java.nio.channels.NotYetBoundException;

public class amstron_no {

	public static void main(String[] args) {
		// number that is equal to the sum of cube of its digit
		int no=435; int revno=0; int sum=0; int rem;
		int orino=no;
		System.out.println("number is" +no);
		while(no!=0)
		{
			rem=no%10;
			sum=sum+rem*rem*rem;
			no=no/10;
			
		}
		System.out.println("rev number is" +revno+ " ");
		if (orino==revno) {
			System.out.println(Number is amstron);

	}
		else
		{
		System.out.println(Number is Not amstron);
		}


}


	}

