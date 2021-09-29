package ch03;

public class OperatorExample5 {
    public static void main(String[] args) {
        //삼항식  -> 조건문 ? 참 : 거짓
        int n1 = 10;
        int n2 = 10;
        String result = n1 >= n2 ? "n1이 n2랑 같거나 크다" : "n2가 n1보다 작다";
        System.out.println(result);


        //mod(나머지) -> %2해서 홀짝 찾을 때, 나머지 구할 때
        System.out.println(10 % 2);
        System.out.println(11 % 2);
        System.out.println(12 % 2);
        System.out.println(13 % 2);

    }
}
//결과타입 ture false  = boolean
//결과타입 1 0 = int
//결과타입 ~랑 같거나 크다 ~보다작다 = string