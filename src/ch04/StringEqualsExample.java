package ch04;

public class StringEqualsExample {
    public static void main(String[] args) {
        //문자열값 비교할 때 ==비교하면 안됨!!!!

        String str1 = "안녕하세요";
        String str2 = new String("안녕하세요");

        System.out.println(str1 == str2);

        String str3 = str2;
        System.out.println(str3 == str2);

        System.out.println("str1.equals(str2) : " + str1.equals(str2));
        System.out.println("str2.equals(str1) : " + str2.equals(str1));
        System.out.println("str3.equals(str1) : " + str3.equals(str1));
    }
}
