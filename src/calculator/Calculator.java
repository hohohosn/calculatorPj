package calculator;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    private final List<Double> results = new ArrayList<>();

    public double calculate(int num1, int num2, char operator) {
        double result = 0;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = (double) num1 / num2;
                } else {
                    System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                }
                break;
            default:
                System.out.println("사칙연산 기호(+,-,*,/)를 사용해주세요.");
        }

        results.add(result); // 계산 결과 저장
        return result;
    }


    // 가장 오래된 데이터 삭제
    public void removeFirstResult() {
        if (!results.isEmpty()) {
            results.remove(0);
        }
    }
}
