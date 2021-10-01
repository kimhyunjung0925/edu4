package ch05;

public class ArrayTest {
    public static void main(String[] args) {
        int[] scores = {100, 87, 56, 23, 28, 98, 30, 32};
        int oddSum = 0;

        for (int i = 0; i < scores.length; i++) {

            if(scores[i] % 2 == 0) {
                System.out.println( scores[i] );
                //System.out.printf( "scores[%d] : %d\n ", i, scores[i] );
            } else{
                oddSum += scores[i];
            }
        }
        System.out.println("홀수 합계 : " + oddSum );
    }
}

// oddSum