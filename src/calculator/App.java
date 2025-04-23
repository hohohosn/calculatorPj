package calculator;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int num1 = sc.nextInt();

            System.out.print("사칙연산 기호(+,-,*,/)를 입력하세요: ");
            char operator = sc.next().charAt(0);
            OperatorType operatorType = OperatorType.fromChar(operator);

            System.out.print("두 번째 숫자를 입력하세요: ");
            int num2 = sc.nextInt();

            double result = calculator.calculate(num1, num2, operator);
            System.out.println("결과: " + result);

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료 / remove 입력 시 첫 결과 삭제)");
            String answer = sc.next();

            if (answer.equals("exit")) {
                System.out.println("종료");
                break;
            } else if (answer.equals("remove")) {
                calculator.removeFirstResult();
                System.out.println("첫 번째 결과가 삭제되었습니다.");
            }
        }
        sc.close();
    }
}
