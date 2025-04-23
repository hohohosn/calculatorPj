사칙연산 계산기 프로젝트

간단한 사칙연산(+, -, *, /)을 수행할 수 있는 콘솔 기반 계산기 프로그램입니다.
양의 정수 및 실수(double) 연산을 지원합니다.



사용 기술

Java 17

IntelliJ IDEA



기능

양의 정수 및 실수 연산 지원

덧셈, 뺄셈, 곱셈, 나눗셈 기능 제공

연산 결과 저장 및 조회

결과 중 입력한 수보다 큰 값만 필터링하여 조회 (람다 & 스트림 사용)

Enum으로 연산자 타입 관리

제네릭으로 다양한 타입 지원




폴더 구조
src/
--- Main.java
--- calculator/
    --- Calculator.java
    --- CalculatorResult.java
    --- OperatorType.java
    --- ArithmeticCalculator.java


실행 과정

IntelliJ에서 프로젝트 열기

App.java 파일 실행

콘솔에서 안내에 따라 숫자와 연산자를 입력

결과 확인

'exit' 입력 시 프로그램 종료
