package hw8.Polynomaials;

import java.util.Arrays;
import java.util.Objects;

public abstract class AbstractPoly implements Poly{
    @Override
    public Poly derivative() {
        double[] derivCoeffs = derive(); // call helper method
        return createPolyFromCoeffs(derivCoeffs); // create new Poly
    }
    double[] derive() {
        double[] derivCoeffs = new double[degree() - 1];
        for (int i = 0; i < derivCoeffs.length; i++) {
            derivCoeffs[i] = coefficient(i + 1) * (i + 1);
        }
        return derivCoeffs;
    }

    abstract Poly createPolyFromCoeffs(double[] coeffs);

    @Override
    public boolean equals(Object o) {
        if(!(o instanceof Poly)) return false;
        Poly other = (Poly) o;
        return Arrays.equals(coefficients(), other.coefficients());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(coefficients());
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
