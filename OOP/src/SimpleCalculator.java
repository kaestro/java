public class SimpleCalculator {

    private double firstNumber, secondNumber;

    public void setFirstNumber(double input) {
        firstNumber = input;
    }

    public double getFirstNumber() {
        return firstNumber;
    }

    public void setSecondNumber(double input) {
        secondNumber = input;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public double getAdditionResult() {
        return firstNumber + secondNumber;
    }

    public double getSubtractionResult() {
        return firstNumber - secondNumber ;
    }

    public double getMultiplicationResult() {
        return firstNumber * secondNumber;
    }

    public double getDivisionResult() {
        if (secondNumber == 0)
            return 0;

        return firstNumber / secondNumber;
    }
}
