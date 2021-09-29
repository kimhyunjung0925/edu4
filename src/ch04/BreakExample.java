package ch04;

public class BreakExample {
    public static void main(String[] args) {
        for(int i=0; i<100; i++) {

            if(i == 50) {
                break;
            }
            System.out.println(i);
        }
    }
}
// break = 가장 가까운 반복문을 멈춤 (while문이든 for문이든)
// 중첩for일때 가장 가까운것만 멈춤