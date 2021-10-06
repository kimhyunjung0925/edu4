package ch06;

public class Tv {
    public String brand; // = null
    private int inch; // = 0

    // 생성자를 통해서 값 넣는 법
    public Tv() {}
    public Tv(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    // setters 이용해 값 넣는 법
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getInch() {
        return inch;
    }

    public void setInch(int inch) {
        this.inch = inch;
    }

}

// getters,setters = 외부와 통신할 수 있는 통로, 메소드
// getters 일 때는 파라미터 필요 없음, 리턴, 100% 쓰임
// 오른키 제너레이터 getters and setters 쉬프트 누르고 둘다 클릭 ok
