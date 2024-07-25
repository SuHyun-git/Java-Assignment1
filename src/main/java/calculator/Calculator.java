package calculator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Calculator {
    private int num1;
    private int num2;
    private List<Integer> results;
    private List<Double> circleResults;

    // PI 같은 경우는 값을 변경하기 못하도록 final을 사용하였다.
    // final static의 의미는 상수라는 뜻으로 PI에 사용하였다.
    final static double PI = 3.14;

    public Calculator() {
        results = new ArrayList<>();
        circleResults = new ArrayList<>();
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public void setResults(List<Integer> results) {
        this.results = results;
    }

    public void setCircleResults(List<Double> circleResults) {
        this.circleResults = circleResults;
    }

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }

    public List<Double> getCircleResults() {
        return circleResults;
    }

    public List<Integer> getResults() {
        return results;
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
        Scanner scanner = new Scanner(System.in);
        System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
        if (scanner.nextLine().equals("remove")) {
            results.remove(0);
        }
    }

    public void inquiryResults(List<Integer> results) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
        if (scanner.nextLine().equals("inquiry")) {
            for (int i : results) {
                System.out.println(i);
            }
        }
    }

    public double calculateCircleArea(double radius) {
        return radius * radius * PI;
    }

    public void circleInquiryResults(List<Double> circleResults) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
        if (scanner.nextLine().equals("inquiry")) {
            for (double i : circleResults) {
                System.out.println(i);
            }
        }
    }
}

