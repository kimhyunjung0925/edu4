package ch04;

public class IfElseIfElseExample {
    public static void main(String[] args) {
        int score = 75;
         if(score >= 90) {
             System.out.println("A 등급");
         } else if(score >= 90) {
             System.out.println("B 등급");
         } else if(score >= 80) {
             System.out.println("C 등급");
         } else {
             System.out.println("D 등급");
         }
    }
}

// Ifelseifelse문 -> false일 경우 실행안됨, true일 경우 실행되고 빠져나옴
// 가장 먼저 만나는 true만 실행