package blackjack;

public class Card {
    private String pattern; //무늬
    private String denomination; //숫자, 값

    //생성자 이용해 값 추가
    public Card(String pattern,String denomination) {
        //super(); 자동생성 생략되어있음, 부모생성자 object 기본생성자 호출
        this.pattern = pattern;
        this.denomination = denomination;
    }

    public String getPattern() {return this.pattern;}
    public String getDenomination() {return this.denomination;}
    public int getPoint() {
        switch (denomination) { //A = 1, 2~10은 제값 , J Q K = 10
            case "A": return 1;
            case "J": case "Q": case "K": return 10;
            default: return Integer.parseInt(denomination); //2~10 문자열 정수형으로 파싱 Integer.parseInt
                                                            // 정수 등등 을 문자열로 바꿈 String.valueOf()
        }
    }


    @Override
    public String toString() {
        return String.format("%s - %s", this.pattern, this.denomination);
        // return "";
        // toString은 object한테 전부다 상속받아 가지고 있음
        // 카드를 출력할 때 오버라이딩 해 줌으로 포멧설정, 값을 출력 할 수 있음
    }
}
/*
값이 바뀌지 않았으면 좋겠으면 생성자
값이 바뀌어도 되면 setter 써도 됨
 */

/*
메소드 생성자 차이
메소드 - return 값 꼭 들어가야함!!
생성자 - 따로 특징들 다 정리하기!!!
*/

/*
static 메소드 쓰일 때
멤버필드 안쓸때, 파라미터 값만 사용할 때 = ()안에 값만 들어갈 때
 */
