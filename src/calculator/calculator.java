package calculator;
import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /* 반복문 사용 해서 연산을 반복 */

        while (true) {
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int num1 = sc.nextInt();

            System.out.print("연산자(+,-,*,/)를 입력하세요: ");
            char operator = sc.next().charAt(0);

            System.out.print("두 번째 숫자를 입력하세요: ");
            int num2 = sc.nextInt();

            int result = 0;
            boolean valid = true;

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
                    if (num2 == 0) {
                        System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                        valid = false;
                    } else {
                        result = num1 / num2;
                    }
                    break;
                default:
                    System.out.println("잘못된 연산자입니다.");
                    valid = false;
            }

            if (valid) {
                System.out.println("답안: " + result);
            }

            /* exit을 입력 받으면 반복 종료 */
            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            String answer = sc.next();
            if (answer.equalsIgnoreCase("exit")) {
                System.out.println("계산기를 종료합니다.");
                break;
            }
        }
    }
}

