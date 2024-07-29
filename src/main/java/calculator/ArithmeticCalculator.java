package calculator;

import java.security.PrivilegedAction;
import java.util.*;
import java.util.function.ToDoubleFunction;
import java.util.stream.Collectors;

public class ArithmeticCalculator<T> extends Calculator{
    private T num1;
    private T num2;

    private List<T> results;

    public ArithmeticCalculator() {
        this.results = new ArrayList<>();
    }

    public void setNum1(T num1) {
        this.num1 = num1;
    }

    public void setNum2(T num2) {
        this.num2 = num2;
    }

    public void setResults(List<T> results) {
        this.results = results;
    }

    public T getNum1() {
        return num1;
    }

    public T getNum2() {
        return num2;
    }

    public List<T> getResults() {
        return results;
    }

    public int calculate(int num1, int num2, char operator) {
        int result = 0;
        AllOperator[] modOperator = new AllOperator[] {new AddOperator(),new SubtractOperator(),new MultiplyOperator(), new DivideOperator(), new ModOperator()};


        if (operator == OperatorType .ADD.label()) {
            result = modOperator[0].operate(num1, num2);
        } else if (operator == OperatorType .SUB.label()) {
            result = modOperator[1].operate(num1, num2);
        } else if (operator == OperatorType .MUL.label()) {
            result =modOperator[2].operate(num1, num2);
        } else if (operator == OperatorType .DIV.label()) {
            result = modOperator[3].operate(num1, num2);
        } else if (operator == OperatorType .MOD.label()) {
            result = modOperator[4].operate(num1, num2);
        }else {
            System.out.println("정확한 기호를 입력해주세요.");
            return -1;
        }

        return result;
    }

    public double calculate(double num1, double num2, char operator) {
        double result = 0;
        AllOperator[] modOperator = new AllOperator[] {new AddOperator(),new SubtractOperator(),new MultiplyOperator(), new DivideOperator(), new ModOperator()};


        if (operator == OperatorType .ADD.label()) {
            result = modOperator[0].operate(num1, num2);
        } else if (operator == OperatorType .SUB.label()) {
            result = modOperator[1].operate(num1, num2);
        } else if (operator == OperatorType .MUL.label()) {
            result =modOperator[2].operate(num1, num2);
        } else if (operator == OperatorType .DIV.label()) {
            result = modOperator[3].operate(num1, num2);
        } else if (operator == OperatorType .MOD.label()) {
            result = modOperator[4].operate(num1, num2);
        }else {
            System.out.println("정확한 기호를 입력해주세요.");
            return -1;
        }

        return result;
    }

    @Override
    public void inquiryResults(List results) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
        if (scanner.nextLine().equals("inquiry")) {
            for (Object i : results) {
                System.out.println(i);
            }
        }
    }

    @Override
    public void removeResult(List results) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
        if (scanner.nextLine().equals("remove")) {
            results.remove(0);
        }
    }

    public void bigNumPrint(int num) {
        System.out.println("숫자를 입력하세요");
        List<Integer>  max = (List<Integer>) results.stream().filter(v -> ((Number) v).intValue() > num).collect(Collectors.toList());;
        max.forEach(System.out::println);
    }


}
