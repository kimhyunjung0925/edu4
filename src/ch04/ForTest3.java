package ch04;

public class ForTest3 {
    public static void main(String[] args) {
        int name = 10;
        for (int i = 2; i <name ; i++) {
            if(i>2) {System.out.println("-------");}
            for (int z = 1; z <name ; z++) {
                System.out.println(i +" x "+ z + " = " + i * z);
                System.out.printf("%d x %d = %d\n",i, z, i*z);
            }

        }
    }
}
