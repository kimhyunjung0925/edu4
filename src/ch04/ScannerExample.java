package ch04;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("나이를 입력하세요 : ");
        int age = scan.nextInt();
        System.out.println("나이 : " + age);
    }
}

/*

 Scanner 빨간색 뜨면 마우스 올렸다가 내리면 alt + enter , 첫번째꺼 선택
 new = 문서화, 객체화, 실체화

 */