package com.javalab.ch02_operator;

public class PE01oper {
    public static void main(String[] args) {

        // 1~50까지 숫자 중 짝수합, 홀수합 구하기
        for (int i = 1; i <= 50; i++) {
            if(i % 2 == 0 ) {
                continue;
            }
            System.out.println("i + i :"+(i + i));
        }

        for (int j = 1; j <= 50; j++) {
            if(j % 2 == 1 ) {
                continue;
            }
            System.out.println("j + j:"+(j + j));
        }
    }
}




