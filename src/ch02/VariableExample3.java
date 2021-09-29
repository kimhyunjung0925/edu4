public class VariableExample3 {
    public static void main(String[] args) {
        char c = 'B';
                System.out.printf("%c : %d", c, (int)c);

                        int i = 69;
                        System.out.printf("%c : %d\n", (char)i, i);

                        boolean bl = false;
                        System.out.println(bl);
    }
}

//boolean 참, 거짓
//byte < char < short < int < long < float < double < string
//정수1bt<문자1yte<정수2bt<정수4bt<정수8bt<실수4bt<실수8bt <
//->방향으로 자동형변환 가능, 반대방향은 수동으로 가능

//byte < char < short < int < long < float < double 전부 string만나면 string으로 변함