package ch07;

public class AnimalTest4 {
    public static void main(String[] args) {
        Animal ani = new Cat();
        Cat cat = (Cat)ani;
        //BigCat bc = (BigCat)cat; 자식은 부모를 가리킬 수 없다 에러뜸
        //bc.sleep();
    }
}
