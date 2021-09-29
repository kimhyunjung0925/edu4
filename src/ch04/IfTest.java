package ch04;

public class IfTest {
    public static void main(String[] args) {
        int score = 95;

        if (score >= 90) {
            if (score >= 98) {
                System.out.println("A+");
            } else if (score <= 93) {
                System.out.println("A-");
            }
        } else if (score >= 80) {
            if (score >= 88) {
                System.out.println("B+");
            } else if (score <= 83) {
                System.out.println("B-");
            }
        } else if (score >= 70) {
            if (score >= 78) {
                System.out.println("C+");
            } else if (score <= 73) {
                System.out.println("C-");
            }
        } else {
            System.out.println("D 등급");
        }
    }
}
