package ch06;

public class ComputerTest {
    public static void main(String[] args) {
        Computer.brand = "삼성";
        System.out.println("Computer.brand : " + Computer.brand); //static 있을 경우

        Computer c1 = new Computer(); //static 없을 경우 인스턴스화 해야함 (new 생성)
        c1.cpu = 10;
        System.out.println("c1.brand : " + c1.brand);
        //System.out.println("Computer.brand : " + Computer.brand); //이렇게 적어주는게 좋음
        System.out.println("c1.cpu : " + c1.cpu);

        Computer c2 = new Computer(); //static 없을 경우 인스턴스화 해야함 (new 생성)
        Computer.brand = "애플";
        c2.cpu = 20;
        System.out.println("c2.brand : " + c2.brand);
        //System.out.println("Computer.brand : " + Computer.brand);
        System.out.println("c2.cpu : " + c2.cpu);

        System.out.println("------------");

        System.out.println("c1.brand : " + c1.brand);
        //System.out.println("Computer.brand : " + Computer.brand);
        System.out.println("c1.cpu : " + c1.cpu);

    }
}
//static 붙으면 brand를 바꾸지 않는 이상 기본 값은 처음 설정한 값 (한 값만 저장됨)
//static 안붙으면 인스턴스 멤버 필드 ( 여러 값 저장 가능)