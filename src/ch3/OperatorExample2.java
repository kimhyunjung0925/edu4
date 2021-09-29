package ch3;

public class OperatorExample2 {
    public static void main(String[] args) {
        boolean play = true;
        System.out.println(play);

        play = !play;
        System.out.println(play);

        play = !play;
        System.out.println(play);

        play = !play;
        System.out.println(play);

    }
}

// 논리연산자
// !는 not  play가 treu인데 !붙이면 false로 바뀜
// 또 복붙하면 또 바뀜 like 스위치