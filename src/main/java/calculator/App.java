package calculator;

import java.util.*;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        List<Integer> results = new ArrayList<>();

        while (true) {
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int num1 = scanner.nextInt();

            System.out.print("두 번째 숫자를 입력하세요: ");
            int num2 = scanner.nextInt();
            scanner.nextLine();

            System.out.print("사칙연산 기호를 입력하세요: ");
            String sign = scanner.nextLine();

            int result = calculator.calculate(num1, num2, sign);
            // 오류가 나오면 -1을 반환한다. -> result에 -1이 들어오면 처음부터 입력을 다시 받는다.
            if (result == -1) {
                continue;
            }

            System.out.println("결과: " + result);

            results.add(result);
            System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
            if (scanner.nextLine().equals("remove")) {
                results.remove(0);
            }

            System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
            if (scanner.nextLine().equals("inquiry")) {
                for (int i : results) {
                    System.out.println(i);
                }
            }

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            if (scanner.nextLine().equals("exit")) {
                break;
            }
        }
    }


}
