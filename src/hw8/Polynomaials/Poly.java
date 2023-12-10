package hw8.Polynomaials;

public interface Poly {
    int degree();

    Poly derivative();
    double coefficient(int degree);

    double[] coefficients();
}
