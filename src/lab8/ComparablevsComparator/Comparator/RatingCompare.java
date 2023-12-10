package lab8.ComparablevsComparator.Comparator;


import java.util.Comparator;

class RatingCompare implements Comparator<Movie> {
    @Override
    public int compare(Movie left, Movie right) {
        // Compare movies based on their ratings
        return Double.compare(left.getRating(), right.getRating());
    }
}

