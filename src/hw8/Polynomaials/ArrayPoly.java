package hw8.Polynomaials;

public class ArrayPoly extends AbstractPoly {

    private final double[] coefficients;

    public ArrayPoly(double[] coefficients) {
        this.coefficients = coefficients;
    }

    @Override
    public int degree() {
        return coefficients.length - 1;
    }

    @Override
    public Poly derivative() {
        double[] derivativeCoeffs = new double[coefficients.length - 1];
        for (int i = 0; i < derivativeCoeffs.length; i++) {
            derivativeCoeffs[i] = coefficients[i + 1] * (i + 1);
        }
        return new ArrayPoly(derivativeCoeffs);
    }

    /**
     * @param coeffs
     * @return
     */
    @Override
    Poly createPolyFromCoeffs(double[] coeffs) {
        return null;
    }

    @Override
    public double coefficient(int degree) {
        return coefficients[degree];
    }

    @Override
    public double[] coefficients() {
        return coefficients; // return original array
    }

}