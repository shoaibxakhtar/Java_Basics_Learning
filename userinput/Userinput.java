package userinput;
import java.util.Scanner;


public class Userinput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\\
		Scanner input = new Scanner(System.in);
		/*//int x = input.nextInt();
		//int y = input.nextInt();
	System.out.println(x+y);  variable can any of the primitive data type 
		| for that- for double --> .nextDouble(),for int --> .nextInt()and similarly for others
		for string --> .nextLine*/
		
		
		//String hello = input.nextLine();
		//System.out.println(hello);
		int principal =input.nextInt();
		float rate = input.nextFloat();
		int time = input.nextInt();
		 
		float simpleInterest = principal *rate *time /100;
		System.out.println(simpleInterest);
		
		
		
	

	}

}
