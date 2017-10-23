import java.util.Scanner;

public class Project1ChangeMaker {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println(" enter amount of change you have: ");
		int change = input.nextInt();
		
		final int quarter = 25;
		final int dime = 10;
		final int nickel = 5;
		final int penny = 1;
		
		int totalquarter = change/quarter;
		change %= quarter;
		int totaldime= change/dime;
		change %= dime;
		int totalnickel= change/nickel;
		change %= nickel;
		int totalpenny= change/penny;
		change %= penny;
	
	System.out.println(" final int quarter: "+ totalquarter );
	System.out.println(" final int dime: "+ totaldime );
	System.out.println(" final int nickel: "+ totalnickel );
	System.out.println(" final int penny: "+ totalpenny );
	

	}

}
