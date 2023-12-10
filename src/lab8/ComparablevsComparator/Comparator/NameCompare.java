package lab8.ComparablevsComparator.Comparator;


import java.util.Comparator;

class NameCompare implements Comparator<Movie> {
    @Override
    public int compare(Movie left, Movie right) {
        // Compare movies based on their names
        return left.getName().compareTo(right.getName());
    }
}

