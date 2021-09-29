package ch03;

public class OperatorExample3 {
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 10;
        int n3 = 20;
        int n4 = 20;

        boolean result1 = n1 >= n2; //true
        boolean result2 = n3 > n4; //false

        System.out.println(result1 && result2);
        System.out.println(result1 || result2);

        System.out.println(true && true && false && true && true); // false
        System.out.println(n1 >= n2 || n3 < n4 || n1 > n4); // true

    }
}
// || or 하나라도 true가 있으면 True
// || or 일 때는 true일 거 같은걸 앞에 배치

// && and 둘다 true여야 true
// && and 일 때는 false일 거 같은걸 앞에 배치