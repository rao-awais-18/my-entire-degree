import java.util.ArrayList;
import java.util.Scanner;

class Movie {
    private final String name;
    private final int releaseYear;
    private final double rating;
    private final String review;
    private final String language;
    private final String actors;
    private final String shortStory;

    // Constructor
    public Movie(String name, int releaseYear, double rating, String review, String language, String actors, String shortStory) {
        this.name = name;
        this.releaseYear = releaseYear;
        this.rating = rating;
        this.review = review;
        this.language = language;
        this.actors = actors;
        this.shortStory = shortStory;
    }

    // Getters
    public String getName() {
        return name;
    }

    // Display Movie Details
    public void displayMovie() {
        System.out.println("\n🎥 Movie Name: " + name);
        System.out.println("📅 Release Year: " + releaseYear);
        System.out.println("⭐ IMDb Rating: " + rating);
        System.out.println("📝 Review: " + review);
        System.out.println("🌐 Language: " + language);
        System.out.println("👨‍🎤 Actors: " + actors);
        System.out.println("📖 Short Story: " + shortStory);
    }
}

public class MovieManager {

    public static void main(String[] args) {
        ArrayList<Movie> movieList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int choice;

        System.out.println("\n🎬========== Welcome To Rao's Movie Manager ==========");


        do {

            System.out.println("1. Add Movie");
            System.out.println("2. Remove Movie");
            System.out.println("3. Search Movie");
            System.out.println("4. View All Movies");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // to consume newline (int and double/numeric buffers are handled with this)

            switch (choice) {
                case 1:
                    // ADD MOVIE
                    System.out.print("Enter Movie Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Release Year: ");
                    int year = sc.nextInt();

                    System.out.print("Enter IMDb Rating (out of 10): ");
                    double rating = sc.nextDouble();
                    sc.nextLine(); // consume newline

                    System.out.print("Enter Review: ");
                    String review = sc.nextLine();

                    System.out.print("Enter Language: ");
                    String lang = sc.nextLine();

                    System.out.print("Enter Actors: ");
                    String actors = sc.nextLine();

                    System.out.print("Enter Short Story: ");
                    String story = sc.nextLine();

                    // Creating object of Movie
                    Movie newMovie = new Movie(name, year, rating, review, lang, actors, story);
                    movieList.add(newMovie);
                    System.out.println("✅ Movie Added Successfully!");
                    break;

                case 2:
                    // REMOVE MOVIE
                    System.out.print("Enter Movie Name to Remove: ");
                    String removeName = sc.nextLine();
                    boolean removed = false;

                    for (int i = 0; i < movieList.size(); i++) {
                        if (movieList.get(i).getName().equalsIgnoreCase(removeName)) {
                            movieList.remove(i);
                            removed = true;
                            System.out.println("🗑 Movie Removed Successfully!");
                            break;
                        } else {
                            System.out.println("This Movie Does't exist in the system!");

                        }
                    }

                    if (!removed) {
                        System.out.println("⚠ Movie Not Found!");
                    }
                    break;

                case 3:
                    // SEARCH MOVIE
                    System.out.print("Enter Movie Name to Search: ");
                    String searchName = sc.nextLine();
                    boolean found = false;

                    for (Movie m : movieList) {
                        if (m.getName().equalsIgnoreCase(searchName)) {
                            System.out.println("🔍 Movie Found!");
                            m.displayMovie();
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("❌ Movie Not Found!");
                    }
                    break;

                case 4:
                    // VIEW ALL MOVIES
                    if (movieList.isEmpty()) {
                        System.out.println("📭 No Movies Added Yet!");
                    } else {
                        System.out.println("\n🎞 All Movies:");
                        for (Movie m : movieList) {
                            m.displayMovie();
                        }
                    }
                    break;

                case 5:
                    // EXIT
                    System.out.println("👋 Exiting... Thanks for using Movie Manager!");
                    break;

                default:
                    System.out.println("❗ Invalid Choice. Try Again.");
            }

        } while (choice != 5);

        sc.close();
    }
}