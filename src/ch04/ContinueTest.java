package ch04;

public class ContinueTest {
    public static void main(String[] args) {
        int sum = 0;
        for(int i=1; i<100; i++) {
            if (i % 2 == 1) {
                continue; //skip
            }
            sum+=i;
        }
        System.out.println("sum : "+ sum);
    }
}
/*
int sum = 0;
        for(int i=1; i<100; i++) {
            if (i % 2 == 0) {
            sum+=i;
        }
        System.out.println("sum : "+ sum);
    }
}
 */