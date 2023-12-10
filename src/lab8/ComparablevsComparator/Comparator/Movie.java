package lab8.ComparablevsComparator.Comparator;

class Movie implements Comparable<Movie> {
    private String name;
    private double rating;
    private int year;

    public Movie(String name, double rating, int year) {
        this.name = name;
        this.rating = rating;
        this.year = year;
    }

    public double getRating() {
        return rating;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    // Implement the compareTo method to compare movies based on their years
    @Override
    public int compareTo(Movie otherMovie) {
        return this.year - otherMovie.year;
    }
}
