package ch04;

public class ForStarTest2 {
    public static void main(String[] args) {
        int star = (int) (Math.random() * 5) + 2; //2~6
        System.out.println("star : " + star);
        for (int z = 0; z < star; z++) {
            for (int i = 0; i <= z; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
/*
star 5
z   /  i
0      0
1      0 1
2      0 1 2
3      0 1 2 3
4      0 1 2 3 4

 */

