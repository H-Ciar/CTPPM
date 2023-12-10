package lab8.ComparablevsComparator.Comparable;


/**
 * A class 'Movie' that implements Comparable
 */
class Movie implements Comparable<Movie> {
    private String name;
    private double rating;
    private int year;

    // Constructor
    public Movie(String name, double rating, int year) {
        this.name = name;
        this.rating = rating;
        this.year = year;
    }

    // Implementing the compareTo method to sort movies by year
    public int compareTo(Movie movie) {
        return this.year - movie.year;
    }

    // Getter methods for accessing private data
    public double getRating() {
        return rating;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }
}

