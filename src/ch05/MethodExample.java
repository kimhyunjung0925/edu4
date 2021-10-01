package ch05;

public class MethodExample {
    public static void main(String[] args) {
        //infut 0, output X (void형)
        sum(10,20);
        sum(50,120);
        minus(100,50,30);
    }
    public static void sum(int n1, int n2) {
        System.out.println("sum : " + (n1 + n2));
    }

    public static void minus(int n1, int n2, int n3) {
        System.out.println("minus : " + (n1 - n2 - n3));
    }
}

// public static void main(String[] args) {} = 메소드
// void main(String[] args) = 메소드 선언부, {  } = 메소드 구현부
// void = 리턴타입
// main = 메소드명
// (String[]arg) = 파라미터(매개변수)