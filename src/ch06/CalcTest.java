package ch06;

public class CalcTest {
    public static void main(String[] args) {

        String str = "10";
        int intStr = Integer.parseInt(str); //문자열을 숫자로 바꿔주는 메소드
        System.out.println(intStr = 10);

        int result = StaticCalc.sum(10,20);
        System.out.println("static sum : " + result);

        Calc calc = new Calc();
        calc.n1 = 10;
        calc.n2 = 20;

        int result2 = calc.sum();
        System.out.println("instance sum : " + result2);

        int result3 = Calc.sum(10,20);

    }
}
//클래스명.메소드 = static
//대문자 시작 = 클래스스