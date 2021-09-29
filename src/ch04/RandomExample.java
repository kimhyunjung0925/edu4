package ch04;

public class RandomExample {
    public static void main(String[] args) {
        //0~5까지 가지기 위함
        int num = (int)(Math.random() * 6);
        System.out.println("num : " + num);

        //2~7까지 가지기위함
        int num2 = (int)(Math.random() * 6 + 2);
        System.out.println("num2 : " + num2);

        //55~108까지 가지기위함
        int num3 = (int)(Math.random() * 54 + 55);
        System.out.println("num2 : " + num3);

    }
}

// 동사, ()가지고있는건 메소드
// 이름,성별,등등등 변수
// Math.random() = double타입 0~0.9999999999