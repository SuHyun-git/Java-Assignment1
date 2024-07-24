package calculator;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int num1 = scanner.nextInt();
            System.out.print("두 번째 숫자를 입력하세요: ");
            int num2 = scanner.nextInt();
            scanner.nextLine();

            System.out.print("사칙연산 기호를 입력하세요: ");
            String sign = scanner.nextLine();

            int result = 0;
            if (sign.equals("+")) {
                result = num1 + num2;
            } else if (sign.equals("-")) {
                result = num1 - num2;
            } else if (sign.equals("*")) {
                result = num1 * num2;
            } else if (sign.equals("/")) {
                if (num2 == 0) {
                    System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                } else {
                    result = num1 / num2;
                }
            }
            System.out.println("결과: " + result);

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            if (scanner.nextLine().equals("exit")) {
                break;
            }
        }
    }
}
