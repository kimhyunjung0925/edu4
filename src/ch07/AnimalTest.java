package ch07;

public class AnimalTest {
    public static void main(String[] args) {
        BigCat bigCat = new BigCat();
        Cat cat = new BigCat();
        Animal animal = new BigCat();
        Animal animal2 = new Cat();
        //Animal animal3 = new Animal();
        //Object obj = new Animal(); //Object는 최상위 객체이기 때문에 다 가능, 심지어 리터럴값 정수도 가능

        //Bigcat bc = new Cat(); // 자식타입은 부모객체 주소값 저장할 수 없다.
        //Cat cat2 = new Animal(); // 자식타입은 부모객체 주소값 저장할 수 없다.

        Cat cat2 = new BigCat();
        cat2.crying();
        //cat2.sleep();

        BigCat bigCat1 = (BigCat)cat2; //자식은 부모객체 주소값 저장할 수 없기 때문에 수동형변환()
        bigCat1.sleep();


        /*
        Integer integer = new Integer(1);
        Float f = new Float(10.1);
        */
    }
}

/*

- 다형성 (여러가지 형태가 있는 성질)
  1. 부모타입은 자식객체 주소값 저장할 수 있다. (가리킬 수 있다.)
  2. 자식타입은 부모객체 주소값 저장할 수 없다. (가리킬 수 없다.빨간줄 컴파일에러 뜸)
  3. 메소드 호출은 타입이 알고 있는 것만 호출 할 수 있고, 내용은 객체 기준이다.

 */