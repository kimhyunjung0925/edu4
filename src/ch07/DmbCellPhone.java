package ch07;

public class DmbCellPhone extends CellPhone{
    int channel;
    /*
    public DmbCellPhone(int channel) {
        this.channel = channel;
    }
    public DmbCellPhone() {
    }
}
     */
    public DmbCellPhone(String model, String color, int channel) {//파라미터가 있는 생성자, 기본생성자 아님
        //super(); // 여기서는 CellPhone의 주소값을 가지고 있음, 부모가 기본생성자만 있을 때 가능
        //super(); // 이 경우가 아닌경우(에러뜨는경우) = 부모가 기본생성자가 없을 때!
                   // (즉 String 값 넣어주기)

        super();
        super.printInfo();

        this.model = model;
        this.color = color;
        this.channel = channel;

        this.printInfo();


        }
    @Override
    void printInfo() {
        super.printInfo();
        System.out.printf("channel : %d\n", channel);
        //System.out.printf("model : %s, color : %s, channel : %s\n", model, color, channel);
    }

}
/*

- this = 나 자신의 주소값을 가지고 있음
       = this.?? -> 멤버필드, 멤버 메소드 사용할 때
       = this(); -> 나 자신의 생성자 호출

- super = 내 직속 부모의 주소값을 가지고 있음
        = super.?? ->
        = super(); -> 부모의 생성자 호출

 */

/*

- 오버로딩 = 똑같은 메소드를 여러개 만드는 기법
- 오버라이딩 = 메소드 재정의
           = 부모에 정의된 메소드를 그대로 사용하지 않고, 새롭게 정의하는 것을 오버라이딩이라고 한다.

 */