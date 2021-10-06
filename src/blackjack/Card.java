package blackjack;

public class Card {
    private String pattern; //무늬
    private String denomination; //숫자, 값

    //생성자 이용해 값 추가
    public Card(String pattern,String denomination) {
        this.pattern = pattern;
        this.denomination = denomination;
    }

    public String getPattern() {return this.pattern;}
    public String getDenomination() {return this.denomination;}
    public int getPoint() {
        switch (denomination) { //A = 1, 2~10은 제값 , J Q K = 10
            case "A": return 1;
            case "J": case "Q": case "K": return 10;
            default: return Integer.parseInt(denomination); //2~10 문자열 정수형으로 파싱
        }
    }


    @Override
    public String toString() {
        return String.format("%s - %s", this.pattern, this.denomination);
        // return "";
    }
}
