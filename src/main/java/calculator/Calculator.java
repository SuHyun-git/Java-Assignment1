package calculator;

public class Calculator {

    public int calculate(int num1, int num2, String sign) {
        int result = 0;

        if (sign.equals("+")) {
            result = num1 + num2;
        } else if (sign.equals("-")) {
            result = num1 - num2;
        } else if (sign.equals("*")) {
            result = num1 * num2;
        } else if (sign.equals("/")) {
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

}
