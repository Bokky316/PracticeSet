package com.javalab.ch02_operator;

import java.util.Scanner;

public class PE01Calculator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("수식을 입력해주세요. (eg. 1 + 2)");
        System.out.println("종료 : q");
        String input;

        while (true) {
            input = scan.nextLine();

            if (input.equals("q")) {
                System.out.println(" 계산을 종료합니다.");
                break;
            }
            String[] parts = input.split(" ");
            if (parts.length != 3){
                System.out.println("수식을 확인해주세요. (숫자 연산자 숫자)");
                continue;
            }

            double x = Double.parseDouble(parts[0]);
            String oper = parts[1];
            double y = Double.parseDouble(parts[2]);

            double result = 0;
            boolean operator = true;

            switch (oper) {
                case "+":
                    result = x + y;
                    break;
                case "-":
                    result = x - y;
                    break;
                case "/":
                    if(y != 0){
                        result = x / y;
                        operator = true;
                    } else {
                        System.out.println("0으로 나눌 수 없습니다.");
                        operator = false;
                    }
                    break;
                case "*":
                    result = x * y;
                    break;

                default:
                    System.out.println("수식을 다시 확인해주세요.");
                     operator = false;
            }
            if (operator=true) {
                System.out.printf("%.2f %s %.2f = %.2f\n", x, oper, y, result);
            }
        }
        scan.close();
    }
}