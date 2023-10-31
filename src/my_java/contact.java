
package my_java;
import java.util.Scanner;

public class contact {
    public static void main(String[] args) {
		// save our contact details
		Scanner scanner=new Scanner (System.in);
		System.out.println("enter your name :");
		String name = scanner.nextLine();
		
		System.out.println("enter your age :");
		int age = scanner.nextInt();

		System.out.println("enter your gender(M/F) :");
		//char gender = scanner.next().charAt(0);
         String gender= scanner.next();
		System.out.println("enter your contact number :");
		int contact = scanner.nextInt();

		System.out.println("User Detail :");
		System.out.println("Name :" +name);
		System.out.println("Age :" +age);
		System.out.println("Gender :"+gender);
		System.out.println("contact Number :" +contact);
		

	}

}
