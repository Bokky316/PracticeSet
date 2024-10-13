package com.javalab.ch02_operator;

import java.util.Scanner;

public class PE01CalculatorModule {
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        calculator(); // 계산기 실행
        scan.close(); // 계산기 종료
    }

    // 계산기 로직
    private static void calculator() {
        System.out.println("수식을 입력해주세요. (eg. 1 + 2)");
        System.out.println("종료 : q");

        while (true) {
            String input = input();

            if (input.equals("q")) {
                System.out.println(" 계산을 종료합니다.");
                break;
            }

            if (!validationInput(input)) {
                System.out.println("수식을 확인해주세요. (숫자 연산자 숫자)");
                continue;
            }
            processInput(input);
        }
    }

    // 입력
    private static String input() {
        return scan.nextLine();
    }

    // 입력 검증
    private static boolean validationInput(String input) {
        String[] parts = input.split(" ");
        if (parts.length != 3) {
        }
    }

    // 입력값 처리
    private static void processInput(String input) {
        String[] parts = input.split(" ");
        double x = Double.parseDouble(parts[0]); // 첫 번째 숫자
        String oper = parts[1]; // 연산자
        double y = Double.parseDouble(parts[2]); // 두 번째 숫자

        double result = startCalculate(x, oper, y); // 계산 수행
        if (Double.isNaN(result)) {
            System.out.println("계산할 수 없습니다.");
        } else {
            System.out.printf("%.2f %s %.2f = %.2f\n", x, oper, y, result);
        }
    }

    // 계산 시작
    private static double startCalculate(double x, String oper, double y) {
        switch (oper) {
            case "+":
                return x + y;
            case "-":
                return x - y;
            case "*":
                return x * y;
            case "/":
                if (y != 0) {
                    return x / y;
                } else {
                    System.out.println("0으로 나눌 수 없습니다.");
                    return Double.NaN;
                }
            default:
                System.out.println("수식을 다시 확인해주세요.");
                return Double.NaN;
        }
    }
}


/*
[Java_객체지향]
package com.example;  // 패키지 선언

import java.util.*;   // 임포트 문: 다른 패키지의 클래스를 사용할 때 필요

public class MyClass {  // 클래스 선언 : 자바 프로그램의 기본 구성 단위
    private int field;  // 필드 : 클래스의 속성을 나타내는 변수

    public MyClass() {  // 생성자 : 객체를 초기화하는 특별한 메소드
        // 초기화 코드
    }

    public void method() {  // 메소드
        // 메소드 내용
    }

    public static void main(String[] args) {  // main 메소드
        // 프로그램 시작점
    }
}
*/

/*
[ static ]
- 해당 멤버가 클래스에 속함
- 프로그램 시작 시 메모리에 한 번만 할당
- 인스턴스 생성 없이 클래스 이름으로 접근 가능, 모든 인스턴스가 공유
- 클래스명.멤버명 형식으로 직접 접근 가능
- 변수, 메소드, 블록, 내부 클래스 사용 가능
- 제한 :
제한사항: non-static 멤버에 직접 접근할 수 없음, this 키워드를 사용할 수 없음
 */

/*
[ public, private ]
public:
- 모든 클래스에서 접근 가능
- 클래스, 메소드, 변수 등에 사용 가능
- 외부에 공개되어야 하는 API나 인터페이스에 주로 사용
private:
- 같은 클래스 내에서만 접근 가능
- 클래스의 내부 구현을 캡슐화하는 데 사용
- 외부에서 직접 접근하면 안 되는 데이터나 메소드에 사용
 */