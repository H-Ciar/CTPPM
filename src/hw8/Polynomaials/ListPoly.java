package hw8.Polynomaials;

import java.util.ArrayList;
import java.util.List;

public class ListPoly extends AbstractPoly {

    private List<Double> coefficients;

    public ListPoly(double[] coeffs) {
        coefficients = new ArrayList<>();
        for (double c : coeffs) {
            coefficients.add(c);
        }
    }

    public ListPoly(List<Double> derivCoeffs) {
        super();
    }

    @Override
    public int degree() {
        return coefficients.size() - 1;
    }

    @Override
    public Poly derivative() {
        List<Double> derivCoeffs = new ArrayList<>();

        for (int i = 0; i < coefficients.size(); i++) {
            derivCoeffs.add(coefficients.get(i) * i);
        }

        return new ListPoly(derivCoeffs);
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
        return coefficients.get(degree);
    }

    @Override
    public double[] coefficients() {
        double[] coeffs = new double[coefficients.size()];
        for (int i = 0; i < coeffs.length; i++) {
            coeffs[i] = coefficients.get(i);
        }
        return coeffs;
    }

}