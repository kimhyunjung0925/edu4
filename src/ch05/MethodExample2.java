package ch05;

public class MethodExample2 {
    public static void main(String[] args) {
        //infut 0, out 0 (비void형)
        int result = sum(10,20);
        System.out.println("sum : " + result);
    }
    public static int sum(int n1, int n2) {

        return n1 + n2;
    }
}
//비void형은 무조건 return 넣어야함!!
//return 결과물이 결과물값과 같아야함!!
//return 값이 10이면 무조건 10 값 출력