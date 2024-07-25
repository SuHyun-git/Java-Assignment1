package calculator;

public class ModOperator implements AllOperator{

    public ModOperator() {
    }

    @Override
    public int operate(int num1, int num2) {
        return num1 % num2;
    }
}
