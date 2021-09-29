package ch02;

public class VariableExample2 {
    public static void main(String[] args) {
        float f;
        double d;

        int n1;

        f = 10.1f;
        d = 10.1;

        double d2 = (f * f); //자동형변환
        //double d2 = (double)(f * f); //이렇게 해줌

        //float f2 = d * d; //자동형변환X
        //float f2 = (float)(d * d); //수동 형변환 해줘야 한다.
        //float f3 = (float)d * (float)d;

    }
}