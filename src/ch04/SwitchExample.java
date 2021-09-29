package ch04;

public class SwitchExample {
    public static void main(String[] args) {
        int num = (int)(Math.random() * 6) + 1; //나올 수 있는 범위 1~6

        switch(num) {
            case 1:
               System.out.println("1번이 나왔습니다.");
               break;
            case 2:
                System.out.println("2번이 나왔습니다.");
                break;
            case 3:
                System.out.println("3번이 나왔습니다.");
                break;
            case 4:
                System.out.println("4번이 나왔습니다.");
                break;
            case 5:
                System.out.println("5번이 나왔습니다.");
                break;
            default:
                System.out.println("6번이 나왔습니다.");
        }
    }
}

//switch문법 -> 정수,문자열,스트링 값 다 들어갈 수 있음 불린,실수는 안됨(double,float)
//break 만나야 빠져나옴, default 전부 다 아닌경우 실행