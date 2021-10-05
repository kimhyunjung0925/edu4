package other;

import java.util.ArrayList;
import java.util.List;
//import java.util.*

public class ArrayListTest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList(); //상속관계 List(Array,Linked)
        // <>값 특정 안하면 문자열, 정수, 실수 다 들어갈 수 있음

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(100);

        int removeVal = list.remove(0);
        System.out.println("removeVal :" + removeVal);
        for(int i=0;i<list.size();i++) {
            System.out.printf("(%d) - %d\n", i, list.get(i));
        }
        /*
        System.out.println(list);

        MyArrayList myList = new MyArrayList();
        myList.add(10);
        myList.add(20);
        myList.add(30);
        myList.add(100);
        myList.print();
        */
    }
}

