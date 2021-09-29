package ch04;

public class IfElseExample {
    public static void main(String[] args) {
        int score = 89;

        if(score >= 90) {
            System.out.println("정수가 90보다 큽니다.");
            System.out.println("등급은 A 입니다.");
        } else {
            System.out.println("정수가 90보다 작습니다.");
            System.out.println("등급은 B 입니다.");
        }
    }
}

// ifelse문(그룹) 둘중 하나만 무조건 실행 -> true면 if문 실행, false면 else 실행