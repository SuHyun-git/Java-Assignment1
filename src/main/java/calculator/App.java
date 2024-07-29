package calculator;

import java.util.*;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArithmeticCalculator<Integer> calculator = new ArithmeticCalculator<>();
        CircleCalculator circleCalculator = new CircleCalculator();


        while (true) {
            System.out.println("1: 사칙연산, 2: 원의 넓이");
            int menu = scanner.nextInt();
            scanner.nextLine();
            if (menu == 1) {
                System.out.print("첫 번째 숫자를 입력하세요: ");
                int num1 = scanner.nextInt();

                System.out.print("두 번째 숫자를 입력하세요: ");
                int num2 = scanner.nextInt();
                scanner.nextLine();

                System.out.print("사칙연산 기호를 입력하세요: ");
                char operator = scanner.next().charAt(0);
                scanner.nextLine();


                int result = calculator.calculate(num1, num2, operator);
                // 오류가 나오면 -1을 반환한다. -> result에 -1이 들어오면 처음부터 입력을 다시 받는다.
                if (result == -1) {
                    continue;
                }

                System.out.println("결과: " + result);

                calculator.getResults().add(result);
                calculator.removeResult(calculator.getResults());
                calculator.inquiryResults(calculator.getResults());

                System.out.println("저장된 연산 결과들 중 더 큰 결과를 출력합니다.");
                calculator.bigNumPrint(scanner.nextInt());
                scanner.nextLine();

                System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
                if (scanner.nextLine().equals("exit")) {
                    System.out.println("프로그램을 종료하였습니다.");
                    break;
                }
            } else if(menu == 2) {

                System.out.print("원의 반지름을 입력하세요: ");
                double circle = circleCalculator.calculateCircleArea(scanner.nextDouble());
                scanner.nextLine();
                System.out.println("원의 넓이는 " + circle);
                circleCalculator.getCircleResults().add(circle);
                circleCalculator.removeResult(circleCalculator.getCircleResults());
                circleCalculator.inquiryResults(circleCalculator.getCircleResults());

                System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
                if (scanner.nextLine().equals("exit")) {
                    System.out.println("프로그램을 종료하였습니다.");
                    break;
                }

            } else {
                System.out.println("숫자를 잘못 입력하셨습니다.");
            }

        }
    }
}
