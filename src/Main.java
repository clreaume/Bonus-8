import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String cont;
	
		ArrayList<Movie> movieList = new ArrayList<Movie>();
			
		movieList.add(new Movie("The Godfather", "Drama"));
		movieList.add(new Movie("13 Going on 30", "Comedy"));
		movieList.add(new Movie("Isle of Dogs", "Animated"));
		movieList.add(new Movie("Meet the Parents", "Comedy"));
		movieList.add(new Movie("Moana", "Animated"));
		movieList.add(new Movie("The Fast and the Furious", "Action"));
		movieList.add(new Movie("Holes", "Comedy"));
		movieList.add(new Movie("Superbad", "Comedy"));
		movieList.add(new Movie("The Lobster", "Action"));
		movieList.add(new Movie("Wallstreet", "Drama"));
		
		System.out.println("Welcome to the Movie List app!");

		do {
		
		System.out.println("What category are you interested in?");
		String userCategory = scan.next();
		
		for(Movie movie : movieList) {
			if (movie.getCategory().equalsIgnoreCase(userCategory)) {
				System.out.println(movie.getTitle());
			}
		}
	
		cont = Validator.getChoiceString(scan, "Would you like to go again? " , "Yes", "No");
		
		} while(cont.equals("Yes"));
		
		System.out.println("Bye!");
		
	}

}
