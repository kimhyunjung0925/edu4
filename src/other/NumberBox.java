package other;

public class NumberBox {
    private int val;

    public NumberBox(int val) {
        this.val = val;
    }

    public int getVal(){
        return this.val;
    }

    @Override
    // 값 비교로 바꾸는 법
    public boolean equals(Object obj) {
        NumberBox temp = (NumberBox)obj;
        return temp.val == this.val;
    }
    @Override
    //해쉬코드를 값으로 바꾸는 법
    public String toString() {
        //return this.val + "";
        //return Integer.toString(this.val);
        return String.valueOf(this.val);
    }

}
