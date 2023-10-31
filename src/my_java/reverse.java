package my_java;

public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no=435; int revno=0; int sum=0; int rem;
		int orino=no;
		System.out.println("number is" +no);
		while(no!=0)
		{
			rem=no%10;
			revno=revno*10+rem;
			no=no/10;
			
		}
		System.out.println("rev number is" +revno+ " ");

	}

}


	


