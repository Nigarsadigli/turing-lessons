package az.edu.turing.module2.TuringLab;

import java.util.Scanner;

public class MovieApp {
    public static void main(String[] args) {
        Movie[] movieArray = new Movie[999];
        int index = 0;
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("\nWelcome\nPlease press 1 to input movies\nPress 2 to display movies and ratings\nPress 3 to add more movies\nPress 4 to find statistics\nPress 5 to search for movie\nPress 6 to update movie rating\nPress 7 to delete a movie\nPress 8 to sort the movies\nPress 0 to exit\n");
            if (scanner.hasNextInt()) {
                int command = scanner.nextInt();
                if (command == 0) {
                    System.out.println("Exiting the system");
                    break;
                } else if (command == 1) {
                    for (int i = 0; i < 3; i++) {
                        addMovie(scanner, index, movieArray);
                        index++;
                    }
                } else if (command == 2) {

                    displayMovies(movieArray, index);
                } else if (command == 3) {
                    System.out.println("How many movies do you want to add?");
                    int movieCount = scanner.nextInt();
                    for (int i = 0; i < movieCount; i++) {
                        addMovie(scanner, index, movieArray);
                        index++;
                    }
                } else if (command == 4) {
                    displayAvgRating(movieArray, index);
                    displayMaxRating(movieArray, index);
                    displayMinRating(movieArray, index);
                } else if (command == 5) {
                    System.out.println("Please enter movie for search: ");
                    scanner.nextLine();
                    String name = scanner.nextLine();
                    searchMovie(index, movieArray, name);
                } else if (command == 6) {
                    System.out.println("Please enter name");
                    scanner.nextLine();
                    String name = scanner.nextLine();
                    updateRating(movieArray, name, scanner);
                } else if (command == 7) {
                    System.out.println("Please enter movie for delete: ");
                    scanner.nextLine();
                    String name = scanner.nextLine();
                    deleteMovie(movieArray, name, index);
                } else if (command == 8) {
                    sortMovie(movieArray, index);
                }
            } else {
                System.out.println("Please enter a number");
            }
        }
    }

    static void addMovie(Scanner scanner, int index, Movie[] movieArray) {
        System.out.println("Please enter the name of the movie");
        scanner.nextLine();
        String movieName = scanner.nextLine();
        while (true) {
            System.out.println("Please enter the rating of the movie");
            if (scanner.hasNextDouble()) {
                double movieRating = scanner.nextDouble();
                if (movieRating > 10 || movieRating < 0) {
                    System.out.println("That is not a valid rating");
                } else {
                    Movie movie = new Movie(movieName, movieRating);

                    movieArray[index] = movie;

                    break;

                }
            } else {
                System.out.println("Invalid input");
            }
        }
    }

    static void displayAvgRating(Movie[] movieArray, int index) {
        double sum = 0;
        for (Movie movie : movieArray) {
            if (movie != null) {
                sum += movie.getRating();
            } else {
                break;
            }
        }
        double avg = sum / index;
        System.out.println("Average rating: " + avg);
    }

    static void displayMaxRating(Movie[] movieArray, int index) {
        double maxRating = movieArray[0].getRating();
        Movie maxMovie = movieArray[0];
        for (int i = 1; i < index; i++) {
            if (maxMovie.getRating() < movieArray[i].getRating()) {
                maxMovie = movieArray[i];
            }

        }
        System.out.println("The movie with maximum rating: " + maxMovie.getName() + " Rating: " + maxMovie.getRating());
    }

    static void displayMinRating(Movie[] movieArray, int index) {
        double minRating = movieArray[0].getRating();
        Movie minMovie = movieArray[0];
        for (int i = 1; i < index; i++) {
            if (minMovie.getRating() > movieArray[i].getRating()) {
                minMovie = movieArray[i];
            }

        }
        System.out.println("The movie with minimum rating: " + minMovie.getName() + " Rating: " + minMovie.getRating());
    }

    static void searchMovie(int index, Movie[] movieArray, String name) {
        Movie movie = null;
        for (int i = 0; i < index; i++) {
            if (movieArray[i].getName().equalsIgnoreCase(name.trim())) {
                movie = movieArray[i];
            }
        }
        if (movie == null) {
            System.out.println("Movie not found");
        } else {
            System.out.println("Movie: " + movie.getName() + " Rating: " + movie.getRating());

        }
    }

    static void updateRating(Movie[] movieArray, String movieName, Scanner scanner) {
        boolean movieExists = false;
        for (Movie movie : movieArray) {
            if (movie != null) {
                if (movie.getName().equalsIgnoreCase(movieName.trim())) {
                    System.out.println("Enter rating for update: ");
                    movie.setRating(scanner.nextDouble());
                    movieExists = true;
                }
            } else {
                break;
            }


        }
        if (!movieExists) {
            System.out.println("No such movie!");
        }
    }

    static void deleteMovie(Movie[] movieArray, String movieName, int index) {
        boolean isFound = false;
        for (int i = 0; i < index; i++) {
            if (movieArray[i].getName().equalsIgnoreCase(movieName.trim())) {
                movieArray[i].setName("deleted");
                movieArray[i].setRating(-1);
                isFound = true;
            }
        }
        if(isFound){
            System.out.println("Movie deleted");
        }
        else{
            System.out.println("No such movie");
        }

    }

    static void displayMovies(Movie[] movieArray, int index) {
        if (index == 0) {
            System.out.println("Movies not found.");
        }
        for (int i = 0; i < index; i++) {
            if (movieArray[i].getName() != "deleted") {
                System.out.println("movie name: " + movieArray[i].getName() + " Rating: " + movieArray[i].getRating());
            }
        }
    }

    static void sortMovie(Movie[] movieArray, int index) {
        Movie temp;

        for (int i = 0; i < index - 1; i++) {

            for (int j = 0; j < index - i - 1; j++) {
                if (movieArray[i].getName() != "deleted") {
                    if (movieArray[j].getRating() > movieArray[j + 1].getRating()) {

                        temp = movieArray[j];
                        movieArray[j] = movieArray[j + 1];
                        movieArray[j + 1] = temp;

                    }
                }
            }

        }
        displayMovies(movieArray, index);

    }

}
