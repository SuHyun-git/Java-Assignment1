package calculator;

import java.util.*;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //int[] results = new int[10];
        int count = 0;
        List<Integer> results = new ArrayList<>();

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
                    continue;
                } else {
                    result = num1 / num2;
                }
            } else {
                System.out.println("정확한 기호를 입력해주세요.");
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
