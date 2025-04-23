package calculator;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ArithmeticCalculator<T extends Number> {
    private final List<Double> results = new ArrayList<>();

    public double calculate(T num1, T num2, OperatorType operatorType) {
        double n1 = num1.doubleValue();
        double n2 = num2.doubleValue();
        double result = 0;

        switch (operatorType) {
            case PLUS -> result = n1 + n2;
            case MINUS -> result = n1 - n2;
            case MULTIPLY -> result = n1 * n2;
            case DIVIDE -> {
                if (n2 == 0) {
                    throw new IllegalArgumentException("0으로 나눌 수 없습니다.");
                }
                result = n1 / n2;
            }
        }

        results.add(result);
        return result;
    }

    public List<Double> getResults() {
        return new ArrayList<>(results); // 캡슐화
    }

    public void removeFirstResult() {
        if (!results.isEmpty()) {
            results.remove(0);
        }
    }

    // 🚀 추가 기능: 입력값보다 큰 결과 조회
    public List<Double> findResultsGreaterThan(double value) {
        return results.stream()
                .filter(r -> r > value)
                .collect(Collectors.toList());
    }
}
