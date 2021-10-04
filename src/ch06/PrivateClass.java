package ch06;

public class PrivateClass {
    private int val;
    int defaultVal;

    public PrivateClass( ){}

    public void print() {
        System.out.println("프린트!!!");
    }
}
/*
            같은클래스    같은패키지    다른패키지
private        O           X            X
default        O           O            X
protected      O           O          상속만
public         O           O            O

private은 클래스 앞에는 못줌(필드 생성자 메소드)
public은 다 됨(클래스 필드 생성자 메소드)

 */