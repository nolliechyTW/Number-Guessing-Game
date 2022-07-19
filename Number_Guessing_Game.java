import java.util.Scanner;

public class Number_Guessing_Game {
	 
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		//Step 1: create a secret number, s, randomly
		int s = (int)(Math.random()*100) ;
		//Step 2: create a boundary for this game
		int min = 0, max = 99;


		//Step 4: add a loop	
		while (true) {
			//Step 3: first guess
			System.out.println("(" + min + "," + max+ ")? " );
			int g = input.nextInt ();
			
			//Step 5: ask the user to reenter the input when the input is not in the feasible range
			if ( g > max || g < min ) {
				System.out.println ("Out of range. Try again.");
				continue; 
			}
			
			//Step 6: check the result
			if ( g > s ) {
				System.out.println ("Too large");
				max = g -1;
			} else if (g < s ) {
				System.out.println ("Too small.");
				min = g +1;
			} else {
				System.out.println ("Bingo.");
				System.out.println("The secret number is:" + s);
				break;
			}
			
			if ( min == max ) {
				System.out.println("You lose the game.");
				System.out.println("The secret number is:" + s);
				break;
				
			}
		
		}
	
	}

}
