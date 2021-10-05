package other;

import java.util.concurrent.atomic.AtomicInteger;

public class NumberBoxTest {
    public static void main(String[] args) {
        NumberBox nb1 = new NumberBox (1);
        NumberBox nb2 = new NumberBox (2);

        System.out.println(nb1==nb2);
        System.out.println(nb1.equals(nb2));
        //.equals는 모든객체가 가지고 있음 object
        // 원래는 문자열 비교, string은 값 비교 = 오버라이딩 되어있어서
        System.out.println(nb1.getVal());
        System.out.println(nb2.getVal());

        System.out.println(nb1);
        System.out.println(nb1.toString());
        System.out.println(nb2);
        System.out.println(nb2.toString());

        String str = new String("abc");
        System.out.println(str);
        System.out.println(str.toString());
    }
}
// println = String으로 바꾸려는 특징
