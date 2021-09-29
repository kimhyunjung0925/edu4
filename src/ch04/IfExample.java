package ch04;

public class IfExample {
    public static void main(String[] args) {
        int score = 93;

        if(score >= 90) {
            System.out.println("정수가 90보다 큽니다.");
            System.out.println("등급은 A 입니다.");
        }

        if(score < 90) {
            System.out.println("정수가 90보다 작습니다.");
            System.out.println("등급은 B 입니다.");
        }
    }
}

// if문 -> true인 경우 if문 안 {} 실행, false인 경우 if문 안 {} 실행 안함
// 조건 잘 설정하면 둘 다 실행도 가능