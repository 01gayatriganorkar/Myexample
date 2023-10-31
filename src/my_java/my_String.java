package my_java;

import java.util.Scanner;

public class my_String {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enetr any string");
String str=sc.next();
String rev="";
//for(int i =0;i<str.length();i++) {
//rev =str.charAt(i)+rev;
//	}
for(int i=str.length()-1;i>=0;i--) {
	rev=rev+str.charAt(i);
}
System.out.println(rev.isEmpty());
}}
