package week11;

public class MyComplex {
    private double real;
    private double imag;

    public MyComplex() {
        this.real = 0.0;
        this.imag = 0.0;
    }

    public MyComplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    @Override
    public String toString() {
        return "(" + real + "+" + imag + "i)";
    }

    public boolean equals(MyComplex another) {
        return (this.real == another.getReal() && this.imag == another.getImag());
    }

    public double magnitude() {
        return (double) Math.sqrt(real * real + imag * imag);
    }

    public MyComplex addInto(MyComplex another) {
        this.real += another.getReal();
        this.imag += another.getImag();

        return this;
    }

    public MyComplex addNew(MyComplex another) {
        MyComplex rsl = new MyComplex();
        rsl.setReal(real + another.getReal());
        rsl.setImag(imag + another.getImag());

        return rsl;
    }

    public boolean equals(double real, double imag) {
        return (this.real == real && this.imag == imag);
    }

    public boolean isReal() {
        return imag == 0.0;
    }

    public boolean isImaginary() {
        return real == 0.0;
    }

    public boolean toReal() {
        return imag == 0.0;
    }

    public void setValue(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }
}
