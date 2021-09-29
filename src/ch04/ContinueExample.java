package ch04;

public class ContinueExample {
    public static void main(String[] args) {
        for(int i=0; i<100; i++) {

            if (i == 50 || i == 55) {
                continue; //skip
            }
            System.out.println(i);
        }
    }
}

//  continue i의 값일때 실행(println)안되고 i++로 올라감
// i는 ||로 50이거나55, &&는 50이면서55인거는 안됨