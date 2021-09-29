package ch03;

public class OperatorExample {
    public static void main(String[] args) {

        int n1 = 10;
        int n2 = 3;

        int result = n1 + n2;
        System.out.println(n1 + " + " + n2 + " = " + result);
        System.out.printf("%d + %d = %d\n", n1, n2,  result);

        int result2 = n1 + (-n2);
        System.out.println(n1 + " + " + -n2 + " = " + result2);
        System.out.printf("%d + -%d = %d\n", n1, n2,  result2);

        boolean result3 = n1 > n2;
        System.out.printf("%d > %d = %b\n" , n1, n2, result3);
        System.out.printf("%d > %d = %b\n" , n1, n2, n1 < n2);
        System.out.println();
        System.out.printf("%d > %d = %b\n" , n1, n2, n1 >= n2);
        System.out.printf("%d > %d = %b\n" , n1, n2, n1 <= n2);
        System.out.println();
        System.out.printf("%d > %d == %b\n" , n1, n2, n1 == n2);
        System.out.printf("%d > %d != %b\n" , n1, n2, n1 != n2);

    }
}
// -붙는거는 단항연산자
// > 초과 , < 미만
// >= 이상 ,  <= 이하
// == 두개 같아야 참 , =! 두개 달라야 참
