package blackjack;

import java.util.LinkedList;
import java.util.List;

public class CardTest {
    public static void main(String[] args) {
        Card c1 = new Card("스페이드","A");
        Card c2 = new Card("스페이드","2");
        Card c3 = new Card("스페이드","3");

        //ArrayList //수정이 잦으면 LinkedList(), 결과는 같음 처리방식이 약간 다름
        List<Card> cards = new LinkedList(); //List랑 LinkedList는 상속관계
        cards.add(c1);
        cards.add(new Card("스페이드","2"));

        Card ccc = cards.get(0);

        System.out.println(c1.getPattern());
        System.out.println(c1.getDenomination());

        System.out.println(c1);
        System.out.println(c2);

        CardDeck cd = new CardDeck();
        cd.showAllCards();

    }

}
// Cards.add 할 때 c1 주소값 넣어주면 타입 정해짐 형변환 할 필요 없어진다.

/*
<Card> 제네릭을 주는 이유
LinkedList나 ArrayList는 object타입이라 오만 값이 다 들어감
그래서 card값만 넣기 위해 설정해줌
설정하면 형변환을 안해도 되서 편함
 */

// 인터페이스(List) = 메소드 선언부만 많이 있음(get, add, size, remove...)
