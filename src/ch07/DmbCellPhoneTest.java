package ch07;

public class DmbCellPhoneTest {
    public static void main(String[] args) {
        DmbCellPhone dcp = new DmbCellPhone("갤럭시 S21","black",10); //string string int 값 넣어줘야함

        dcp.powerOn();
        dcp.powerOff();
        dcp.printInfo();
        System.out.println("채널 : " + dcp.channel);
        dcp.sendMsg("안녕~");
    }
}
/*

*** 은닉화, 캡슐화 ***
멤버필드 숨겨져 있음(값을 바로 넣을 수 없음)

- 객체에 은닉화된 멤버필드에 값을 넣을 수 있는 방법 딱 2가지
1. setter 메소드 이용해서 객체에 값을 넣었음
2. 생성자(new)를 이용해서 객체에 값을 넣었음

- 객체에 은닉화된 멤버필드에 값을 빼내는 방법 딱 1가지
1. getter 메소드 이용해서 객체에 값을 빼냄

 */

/*

- final 키워드(얼린다는 뜻?)
  = final 클래스 - 상속 못함
  = final 멤버필드 - 상수 됨
  = final 메소드 - 오버라이딩 못함

 */

