package ch07;

import ch06.Car;

public class AnimalTest2 {
    public static void main(String[] args) {
        BigCat bc = new BigCat();
        Cat cat = new Cat();
        Dog dog = new Dog();
        Cow cow = new Cow();

        animalCrying(bc);
        animalCrying(cat);
        animalCrying(dog);
        animalCrying(cow);

    }
    //다형성 이용
    public static void animalCrying(Animal ani) {
        ani.crying();

        /*
        오버로딩 이용
        public static void animalCrying(BigCat bc) {bc.crying();}
        public static void animalCrying(Cat cat) {cat.crying();}
        public static void animalCrying(Dog dog) {dog.crying();}
        public static void animalCrying(Cow cow) {cow.crying();}
     */

    }

}

    /* static
    public class AnimalTest2 {
    public static void main(String[] args) {
        BigCat bc = new BigCat();
        Cat cat = new Cat();
        Dog dog = new Dog();
        Cow cow = new Cow();

        AnimalTest2 at2 = new AnimalTest2();

        at2.animalCrying(bc);
        at2.animalCrying(cat);
        at2.animalCrying(dog);
        at2.animalCrying(cow);

        public void animalCrying(Animal ani) { ani.crying(); }
    }
     */


