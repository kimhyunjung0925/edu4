package ch05;

public class PrimitiveAndRefExample2 {
    public static void main(String[] args) {

        String s1 = new String("HELLO");
        System.out.println(s1);
        changeVal(s1);
        System.out.println(s1);
    }

    public static void changeVal(String str) {
        str = new String("안녕");
    }
}
//String은 값 못바꿈 s1 안바뀜