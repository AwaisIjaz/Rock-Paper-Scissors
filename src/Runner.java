import java.util.Scanner;
import java.util.Random;

public class Runner {

	public static void main(String[] args) {
		
		System.out.println("Let's play Rock, Paper, Scissors! Please enter a move.");
		boolean wantToPlay = true;
		String user;
		
		do { 
		Scanner scan = new Scanner(System.in);
		user = scan.nextLine(); 
		new Runner().userInputMethod(user); 

		Random randomObject = new Random();
		String[] objects = { "Rock", "Paper", "Scissors" };
	    String objectGenerated = objects[randomObject.nextInt(objects.length)];
	    System.out.println("Computer chose " + objectGenerated + "!");	
	
	
	    if ((user.equals("Rock")) && (objectGenerated.equals("Rock")) || (user.equals("Paper")) && (objectGenerated.equals("Paper")) || (user.equals("Scissors")) && (objectGenerated.equals("Scissors"))){
	    System.out.println("You have tied!"); 
	    }
	   	
	    else if ((user.equals("Rock")) && (objectGenerated.equals("Scissors")) || (user.equals("Paper")) && (objectGenerated.equals("Rock")) || (user.equals("Scissors")) && (objectGenerated.equals("Paper"))){
		    System.out.println("You have won!"); 
		    }
	    
	    else if ((user.equals("Rock")) && (objectGenerated.equals("Paper")) || (user.equals("Paper")) && (objectGenerated.equals("Scissors")) || (user.equals("Scissors")) && (objectGenerated.equals("Rock"))){
		    System.out.println("You have lost!");
	        }
	    
	    System.out.println("What is your next move? If you would like exit the game, enter 'Quit'");
	    
	    if (user.equals("Quit"))
	        wantToPlay = false;	
	        }
		
		while (wantToPlay);

		System.out.println("Game over.");
	    
		}

	public static void userInputMethod(String user) {

		if (user.equals("Rock"))

		{
			System.out.println("You chose Rock!");
		}

		else if (user.equals("Paper")) {
			System.out.println("You chose Paper!");
		}

		else if (user.equals("Scissors")) {
			System.out.println("You chose Scissors!");
		}

		

	}
}
