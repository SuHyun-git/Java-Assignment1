package calculator;

public class DivideOperator implements AllOperator{

    public DivideOperator() {
    }

    public int operate(int num1, int num2) {
        try {
            return num1 / num2;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
            return -1;
        }
    }
}
