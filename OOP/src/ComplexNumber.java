public class ComplexNumber {

    private double real, imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void add(double real, double imaginary) {
        this.real += real;
        this.imaginary += imaginary;
    }

    public void add(ComplexNumber rhs) {
        this.add(rhs.getReal(), rhs.getImaginary());
    }

    public void subtract(double real, double imaginary) {
        this.add(-real, -imaginary);
    }

    public void subtract(ComplexNumber rhs) {
        this.subtract(rhs.getReal(), rhs.getImaginary());
    }
}
