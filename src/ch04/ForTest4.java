package ch04;

public class ForTest4 {
    public static void main(String[] args) {
        for (int i = 1; i <10 ; i++) {
            for (int z = 2; z <10; z++) {
                System.out.printf("%d x %d = %d\t", z, i, i * z);
            }
            System.out.println();
        }
    }
}
/*

 바깥for 하나의 값에 고정 안쪽for문 순서대로실행
 Ex) i=1 z=1,2,3,4,...9 출력(println), i=2 z=1,2,3..9 출력(println),  ...반복
 /t = 탭  /n =개행

 */

