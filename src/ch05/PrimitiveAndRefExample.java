package ch05;

public class PrimitiveAndRefExample {
    public static void main(String[] args) {
        int val = 10;

        Box box = new Box();
        box.val = 10;

        Box box2 = box;
        box2.val = 20;

        box2 = new Box();

        System.out.println("val : " + val);
        changeVal(val);
        System.out.println("val : " + val);
        System.out.println("----------");
        System.out.println("box.val : " + box.val);
        changeVal(val);
        System.out.println("box.val : " + box.val);
        System.out.println("box2.val : " + box2.val);
    }
    public static void changeVal(int pVal) {pVal = 30;}
    public static void changeVal(Box pBox) {pBox.val = 30;}
}


class Box {
    int val;
}

//public을 붙일 수 있는 클래스는 파일명과 같은 클래스 앞에만 가능