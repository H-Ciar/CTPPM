package hw3.moreexcersises;

public class MatrixTest {
    public static void main(String[] args) {
        // Create some matrices
        Matrix a = new Matrix(new double[][] {{1, 5}, {2, 3}, {1, 7}});
        Matrix b = new Matrix(new double[][] {{1, 2, 3, 7}, {5, 2, 8, 1}});
        Matrix c = new Matrix(new double[][] {{26, 12, 43, 12}, {17, 10, 30, 17}, {36, 16, 59, 14}});
        Matrix d = new Matrix(new double[][] {{1}, {2}, {3}});
        Matrix e = new Matrix(new double[][] {{4}, {5}, {6}});

        // Test the addition method
        System.out.println("Testing addition:");
        Matrix.add(a, b).print(); // should throw an exception
        Matrix.add(d, e).print(); // should print {{5}, {7}, {9}}

        // Test the subtraction method
        System.out.println("Testing subtraction:");
        Matrix.subtract(a, b).print(); // should throw an exception
        Matrix.subtract(e, d).print(); // should print {{3}, {3}, {3}}

        // Test the multiplication method
        System.out.println("Testing multiplication:");
        Matrix.multiply(a, b).print(); // should print c
        Matrix.multiply(b, a).print(); // should throw an exception
    }
}

