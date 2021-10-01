package ch05;

import java.util.Scanner;

public class ArrayTest2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] numberArr = new int[3];
        System.out.println("숫자 3개를 입력해 주세요.");
        for (int i = 0; i < numberArr.length; i++) {
            System.out.printf("숫자%d : ", (i+1) );
            numberArr[i] = scan.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < numberArr.length; i++) {
            sum += numberArr[i];
        }
            System.out.println("합계 : " + sum);
            System.out.println("평균 : " + (float)sum / numberArr.length);
    }
}

/*
유연한버전, 숫자 입력 갯수부터 지정
 public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("몇 개의 숫자를 사용할 것 입니까? : ")
        int LEN = scan.nextInt();

        int[] numberArr = new int[LEN];
        System.out.printf("숫자 %d개를 입력해 주세요.\n", numberArr.length);
        for (int i = 0; i < numberArr.length; i++) {
            System.out.printf("숫자%d : ", (i+1) );
            numberArr[i] = scan.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < numberArr.length; i++) {
            sum += numberArr[i];
        }
            System.out.println("합계 : " + sum);
            System.out.println("평균 : " + (float)sum / numberArr.length);
    }
 */
