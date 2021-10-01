package ch05;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class MethodTest {
    public static void main(String[] args) {
        printMyself("황장군", 17, 180.82f, 'A');
        System.out.println();
        int mon = (int) (Math.random() * 12) + 1;
        System.out.println("mon : " + mon);
        printSeason(mon);

    }

    public static void printMyself(String name, int age, float height, char bloodType) {
        System.out.printf("%s의 나이는%d세 키는 %fcm, 혈액형은 %c 형이다.", name, age, height, bloodType);
    }
    public static void printSeason(int mon) {

        if (mon < 1 || mon > 12) {
            System.out.println("알 수 없음");
        }
        else if ( mon == 12 || mon < 3 ) {
            System.out.println("겨울");
        } else if (mon < 6) {
            System.out.println("봄");
        } else if (mon  <9 ) {
            System.out.println("여름");
        } else {
            System.out.println("가을");
        }
    }
}
/*
        int mon = (int)(Math.random() * 12 ) + 1;

        switch(mon) {
            case 12: case 1: case 2:
                System.out.println("겨울");
                break;
            case 3: case 4: case 5:
                System.out.println("봄");
                break;
            case 6: case 7: case 8:
                System.out.println("여름");
                break;
            case 9: case 10: case 11:
                System.out.println("가을");
                break;
            default:
                System.out.println("알 수 없음");
                break;
 */