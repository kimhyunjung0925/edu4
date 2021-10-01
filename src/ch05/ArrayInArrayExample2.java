package ch05;

public class ArrayInArrayExample2 {
    public static void main(String[] args) {

        int[][] arr = {{1, 2, 3}, {4, 5, 6}};

        System.out.println(arr.length); // 줄 수 나옴 (두줄)
        System.out.println(arr[0].length); //칸 수 나옴 (첫칸의 총 칸 수)
        System.out.println(arr[1].length); //칸 수 나옴 (둘째칸의 총 칸 수)
        System.out.println(arr[2].length); //칸 수 나옴 (셋째칸의 총 칸 수)


        for (int i = 0; i < arr.length; i++) {
            for (int z = 0; z < arr[i].length; z++) {
                System.out.printf("(%d, %d) : %d\t", i, z, arr[i][z]);
            }
            System.out.println();
        }
    }
}