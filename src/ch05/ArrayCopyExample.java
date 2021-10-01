package ch05;public class ArrayCopyExample {
    public static void main(String[] args) {
        int[] arr1 = {10, 20, 30};
        int[] arr2 = arr1; //얕은복사 (arr1,arr2 둘다 {}값 이용)

        System.out.println("arr1[0] : " + arr1[0]);
        System.out.println("arr1[0] : " + arr2[0]);

        arr1[0] = 5;

        System.out.println("arr1[0] : " + arr1[0]);
        System.out.println("arr1[0] : " + arr2[0]);

        System.out.println(arr1 == arr2);
    }
}
