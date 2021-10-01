package ch05;

import java.sql.PseudoColumnUsage;

public class ArrayExample {
    public static void main(String[] args) {
        // 배열(Array = 같은 타입의 값을 여러개 저장할 때 좋음, for문과 같이 사용하면 좋음
        int [] scores = {83, 90, 87}; //int형 배열
        //scores[4] = 11;
        //System.out.println scores[0];
        System.out.println( scores.length);


        for(int i=0; i<scores.length; i++) {
            System.out.println(scores[i]);
        }
    }
}
