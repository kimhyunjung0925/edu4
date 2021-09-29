package ch04;

public class ForTest {
    public static void main(String[] args) {
        //구구단
        int dan = (int)(Math.random() * 8) + 2; //2~9

        for(int i = 1; i<10; i++){
            System.out.println(dan + " x " + i + " = " + dan*i);
        }
        System.out.println();
        for(int i = 10; i<19; i++){
            System.out.println(dan + " x " + i + " = " + dan*i);
        }
    }
}
