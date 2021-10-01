package ch05;

public class MethodTest3 {
    public static void main(String[] args) {
        int rVal = getRandom(30, 40);
        System.out.println(rVal);

        int absVal = getABS(10);
        int absVal2 = getABS(-10);
        System.out.println("absVal : " + absVal);
        System.out.println("absVal2 : " + absVal2);
    }

    public static int getRandom(int v1, int v2) {
        int result = (int)(Math.random() * (v2 - v1 + 1)) + v1;
            return result;
            //return (int)(Math.random() * * (v2 - v1 + 1)) + v1;
    }

    public static int getABS(int val) {
        if(val < 0 ) {return -val;}
        return val;
        // return val < 0 ? -val : val;
    }
}
