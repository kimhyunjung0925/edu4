package ch04;

public class ForstarTest3 {
    public static void main(String[] args) {
        int star = (int) (Math.random() * 5) + 2; //2~6
        System.out.println("star : " + star);
        for (int i = star; i > 0; i--) {
            for (int z = 1; z <= star; z++) {
                if (z < i) {
                    System.out.print("_");
                } else {
                    System.out.print("*");
                }
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

