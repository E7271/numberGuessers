import java.util.Random;
import java.util.Scanner;

public class Main {
	static Random R = new Random();
	static int max = 2147483647;
	//static int max = 10000000;
	static int min = 1;
	
	static int max2 = 2147483647;
	//static int max2 = 10000000;
	static int min2 = 1;
	
	static int counter = 0;
	static int highCounter = 0;
	static int lowCounter = 0;
	static int Rand = R.nextInt((max - min) + 1) + min;
	
	public static void main(String[] args) {
		Random R = new Random();
		// TODO Auto-generated method stub
		//System.out.println("Guess a number");
		Scanner in = new Scanner(System.in);
		//int guess = in.nextInt();
		int guess = R.nextInt((max2 - min2) + 1) + min2;
		
		
	while (guess != Rand) {
		if (guess == Rand) {
			System.out.println("Computer Got the Number");
			System.out.println("The number was: " + Rand);
			counter++;
			System.out.println(counter);
		}
		else {
			System.out.println("guess was incorrect, try again: " + guess);
			System.out.println("The number the computer is searching for is: " + Rand);
			counter++;
			//System.out.println(counter);
			
			if(guess >= Rand){
				max2 = guess; 
				highCounter++;
				System.out.println("Computer Guessed too high");
				System.out.println("Number of Guesses: " +counter);
				//System.out.println(min2);
				//System.out.println(max2);
				System.out.println("Number of High Guesses: " + highCounter);
				System.out.println("Number of Low Guesses: " + lowCounter);
				System.out.println("+------------------------------+");
				
			}
			else if(guess <= Rand){
				min2 = guess; 
				lowCounter++;
				System.out.println("Computer Guessed too low");
				System.out.println("Number of Guesses: " +counter);
				//System.out.println(min2);
				//System.out.println(max2);
				System.out.println("Number of High Guesses: " + highCounter);
				System.out.println("Number of Low Guesses: " + lowCounter);
				System.out.println("+------------------------------+");
			}
		}
		in.close();
	
		guess = R.nextInt((max2 - min2) + 1) + min2;
		}
	}
}