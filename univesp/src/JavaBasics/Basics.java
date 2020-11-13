package JavaBasics;

import java.util.Scanner;

public class Basics {
/*
 * A comment /* + Enter
 */

	//int age= 30;
	
	public static void main(String[] args){
		//Single line comment
		String greeting = "Hello guys, how are you doing?";
		//System.out.println(greeting);
		String Upper_greeting = greeting.toUpperCase();
		//System.out.println(Upper_greeting);
		String answer = "I am fine";
		String answerd = addExclamationPoint(answer);
		//System.out.println(answerd);
		int de = 12;
		//System.out.println(Integer.toString(de));
		//System.out.print(de);
		
		
		//Basics2 a= new Basics2();
		//System.out.println( a.IamDog());
		//System.out.println( Basics2.IamDog());
		
		//ScanInput();
		//Cases();
		Arrays();
	}
	
	public static String addExclamationPoint( String s) {
		return s+ "!";
	}
	
	public static void ScanInput() {
		java.util.Scanner scan = new Scanner (System.in);
		System.out.println("Enter some number");
		int user_input = scan.nextInt();
		System.out.println("The value is " + user_input);
		System.out.print(user_input);
		scan.close();
	}
	
	public static void Cases() {
		//int score =33;
		String score="90";
		switch (score)
		{
		case "100":
			System.out.println("Perfect");
		case "90": 
			System.out.println("verygood");
		//default:
		//	System.out.println("Default");
		}
	}
	
	public static void Arrays() {
		int[] myarray= {1,2,3,4,5};
		for(int i=0;i<=4;i++) {
		System.out.print(myarray[i]+" ");
		}
	}

}
