package calculator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CircleCalculator extends Calculator{
    // PI 같은 경우는 값을 변경하기 못하도록 final을 사용하였다.
    // final static의 의미는 상수라는 뜻으로 PI에 사용하였다.
    final static double PI = 3.14;
    private List<Double> circleResults;


    public CircleCalculator() {
        this.circleResults = new ArrayList<>();
    }


    public List<Double> getCircleResults() {
        return circleResults;
    }

    public void setCircleResults(List<Double> circleResults) {
        this.circleResults = circleResults;
    }

    @Override
    public void inquiryResults(List results) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
        if (scanner.nextLine().equals("inquiry")) {
            for (double i : (List<Double>)results) {
                System.out.println(i);
            }
        }
    }



    public double calculateCircleArea(double radius) {
        return radius * radius * PI;
    }

}
