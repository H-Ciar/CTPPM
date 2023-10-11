package hw3.moreexcersises;

// A class to represent a matrix and provide some operations
public class Matrix {
    // The 2D array to store the matrix elements
    private double[][] data;
    // The number of rows and columns of the matrix
    private int rows, cols;

    // A constructor to create a matrix from a 2D array
    public Matrix(double[][] data) {
        this.data = data;
        this.rows = data.length;
        this.cols = data[0].length;
    }

    // A constructor to create an empty matrix with the given dimensions
    public Matrix(int rows, int cols) {
        this.data = new double[rows][cols];
        this.rows = rows;
        this.cols = cols;
    }

    // A method to get the number of rows of the matrix
    public int getRows() {
        return rows;
    }

    // A method to get the number of columns of the matrix
    public int getCols() {
        return cols;
    }

    // A method to get the element at the given row and column of the matrix
    public double get(int row, int col) {
        return data[row][col];
    }

    // A method to set the element at the given row and column of the matrix
    public void set(int row, int col, double value) {
        data[row][col] = value;
    }

    // A method to create a random matrix with the given dimensions and range
    public static Matrix createRandomMatrix(int rows, int cols, double min, double max) {
        Matrix matrix = new Matrix(rows, cols);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                double value = Math.random() * (max - min) + min; // a random value in [min, max)
                matrix.set(i, j, value);
            }
        }
        return matrix;
    }

    // A method to print the matrix to the standard output
    public void print() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
    }

    // A method to check if two matrices have the same dimensions
    public static boolean haveSameDimension(Matrix a, Matrix b) {
        return a.getRows() == b.getRows() && a.getCols() == b.getCols();
    }

    // A method to add two matrices and return the result as a new matrix
    public static Matrix add(Matrix a, Matrix b) {
        if (!haveSameDimension(a, b)) {
            throw new IllegalArgumentException("Matrices must have the same dimension");
        }
        int rows = a.getRows();
        int cols = a.getCols();
        Matrix result = new Matrix(rows, cols);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                double value = a.get(i, j) + b.get(i, j); // add the corresponding elements
                result.set(i, j, value);
            }
        }
        return result;
    }

    // A method to subtract two matrices and return the result as a new matrix
    public static Matrix subtract(Matrix a, Matrix b) {
        if (!haveSameDimension(a, b)) {
            throw new IllegalArgumentException("Matrices must have the same dimension");
        }
        int rows = a.getRows();
        int cols = a.getCols();
        Matrix result = new Matrix(rows, cols);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                double value = a.get(i, j) - b.get(i, j); // subtract the corresponding elements
                result.set(i, j, value);
            }
        }
        return result;
    }

    // A method to multiply two matrices and return the result as a new matrix
    public static Matrix multiply(Matrix a, Matrix b) {
        if (a.getCols() != b.getRows()) {
            throw new IllegalArgumentException("The number of columns of the first matrix must match the number of rows of the second matrix");
        }
        int rows = a.getRows();
        int cols = b.getCols();
        int n = a.getCols(); // or b.getRows()
        Matrix result = new Matrix(rows, cols);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                double value = 0;
                for (int k = 0; k < n; k++) {
                    value += a.get(i, k) * b.get(k, j); // multiply the corresponding elements and sum them up
                }
                result.set(i, j, value);
            }
        }
        return result;
    }

    // Other methods such as transpose, inverse, determinant, etc. can be added here
}

