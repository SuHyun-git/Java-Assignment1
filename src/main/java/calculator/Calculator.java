package calculator;

import java.util.List;
import java.util.Scanner;

public class Calculator {
    private int num1;
    private int num2;

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }

    public int calculate(int num1, int num2, char operator) {
        int result = 0;

        if (operator == '+') {
            result = num1 + num2;
        } else if (operator == '-') {
            result = num1 - num2;
        } else if (operator == '*') {
            result = num1 * num2;
        } else if (operator == '/') {
            try {
                result = num1 / num2;
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                return -1;
            }
        } else {
            System.out.println("정확한 기호를 입력해주세요.");
            return -1;
        }

        return result;
    }

    public void removeResult(List<Integer> results) {
        System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
        Scanner scanner = new Scanner(System.in);
        if (scanner.nextLine().equals("remove")) {
            results.remove(0);
        }
    }
}

