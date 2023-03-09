import java.util.Scanner;
public class MovieDriver {

	public static void main(String[] args) {
		//create a new object of type Scanner that reads from the keyboard
		Scanner keyboard = new Scanner(System.in);
		
		//create a new movie object
		Movie info = new Movie();
		
		//Prompt the user to enter the title of a movie
		System.out.println("Enter the title of the movie");
		//Read in the line that the user types
		String title = keyboard.next();
		keyboard.nextLine();
		//set the title in the movie object
		info.setTitle(title);
		
		//Prompt the user to enter the movie's rating
		System.out.println("Enter the movie's rating");
		//Read in the line that the user types
		String rating = keyboard.next();
		//Set the rating in the movie object
		info.setRating(rating);
		
		//Prompt the user to enter the number of tickets sold at a (unnamed) theater
		System.out.println("Enter the number of tickets sold at this theater");
		//Set the number of tickets sold in the movie object
		int ticketsSold = keyboard.nextInt();
		//Set the number of tickets sold in the movie object
		info.setSoldTickets(ticketsSold);
		
		//Print out the information using the movie's toString method
		System.out.println(info.toString());

	}

}
