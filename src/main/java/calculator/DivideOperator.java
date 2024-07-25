package calculator;

public class DivideOperator {

    // 문제에서는 생성자를 활용하라고 하였는데 튜터님께 여쭤보고 이 방법으로 하였습니다.
    // 계산 기능의 경우 변경이 없어서 class 선언 없이 바로 사용할 수 있도록 static으로 구현하였습니다.
    public static int operate(int num1, int num2) {
        try {
            return num1 / num2;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
            return -1;
        }
    }
}
