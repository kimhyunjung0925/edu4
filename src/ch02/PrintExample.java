package ch02;

public class PrintExample {
    public static void main(String[] args) {
        System.out.println("안녕하세요");
        System.out.println("안녕하세요");
        System.out.println("------");
        System.out.print("안녕하세요");
        System.out.print("안녕하세요\n");
        System.out.print("안녕하세요");
        System.out.print("안녕하세요");
        System.out.println();

        String nm = "홍길동";
        int age = 17;
        float height = 180.8f;
        char bloodType = 'A';

        System.out.println(nm + "의 키는" + height + "cm, 나이는 " + age + "세, 혈액형은 " + bloodType + "형이다.");

        System.out.printf("%s의 키는 %fcm, 나이는 %d세, 혈액형은 %c형이다.", nm, height, age, bloodType);
        System.out.println();
        System.out.printf("%s의 키는 %scm, 나이는 %s세, 혈액형은 %s형이다.", nm, height, age, bloodType);
    }
}
//%s문자열 %f실수 %d정수 %c문자
//%f.2 = 소수점2개까지만 나옴 , %9.2 = 전체칸9칸,소수점2개까지,빈칸은0으로 채움
//%09d = 9자리정수, 빈칸은0으로채움
//%s 는 무적