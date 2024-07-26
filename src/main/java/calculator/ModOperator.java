package calculator;

public class ModOperator implements AllOperator{

    public ModOperator() {
    }

    @Override
    public int operate(int num1, int num2) {
        return num1 % num2;
    }

    @Override
    public double operate(double num1, double num2) {
        return num1 % num2;
    }


}
