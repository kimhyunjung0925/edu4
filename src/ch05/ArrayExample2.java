package ch05;

public class ArrayExample2 {
    public static void main(String[] args) {
        int[] arr = new int[8];
        for(int i=0; i<arr.length; i++) {
            arr[i] = (i + 1) * 100;
        }

        for(int i=0; i<arr.length; i++) {
            System.out.println( arr[i] );
        }
    }
}
