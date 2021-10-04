package ch06;
/*
2가지로 구성
- 멤버필드 (변수,상수)
- 메소드
 */
public class Car {
    String nm;
    String brand;

    Car() {}
   // 기본생성자
   // 1. 이름이 클래스랑 같아야 함
   // 2. (앞쪽에)리턴 타입이 없어야 한다. (void 들어가면 안됨)
   // * 생성자가 하나도 없으면 컴파일러가 자동으로 넣어준다
   // 오버로딩 : 똑같은 이름의 메소드를 여러개 만들 수 있는 기술,
    //          파라미터만 다르면 다르게 만들 수 있다
    //          타입만 중요, 타입의 종류 갯수 순서, 리턴타입은 상관 없음!
    // 호출하는 순서만 달라도 가능스 스트링 스트링, 인트 스트링, 인트 인트, 스트링 인트


    Car(String brand, String nm) { // 지역변수, 전역변수
        this.brand = brand; //나 자신의 주소값
        this.nm = nm;
    }


    public void drive() {
        System.out.printf("%s의 %s가 달린다.\n",brand,nm);
    }

    public void stop() {
        System.out.printf("%s의 %s가 멈춘다.\n",brand,nm);
    }
}
