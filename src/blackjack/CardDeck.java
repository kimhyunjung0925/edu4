package blackjack;

import java.util.ArrayList;
import java.util.List;

public class CardDeck {
    private List<Card> cards;

    public CardDeck() { init(); }

    private void init() {
        String[] patters = new String[] {"스페이드","하트","클럽","다이아몬드"};
        cards = new ArrayList();
        for(int i=0; i<patters.length; i++) {
            for(int z=1; z<=13; z++) {
                String denomination = null;
                switch(z) {
                    case 1: denomination = "A";
                        break;
                    case 11: denomination = "J";
                        break;
                    case 12: denomination = "Q";
                        break;
                    case 13: denomination = "K";
                        break;
                    default:
                        denomination = String.valueOf(z); //2~10은정수를 문자열로 변경 (z + "")

                }
                Card c = new Card(patters[i], denomination);
                cards.add(c);
                //cards.add(new Card(patterns[i],denomination)); //위에꺼랑 같은 뜻
            }
        }
    }
    // 항상 랜덤한 카드를 준다.
    public Card getCard() {
        //만약 콜렉션을 배열로 했다면 먼저 섞고, 순차적으로 카드를 줬을꺼다.
        //현재 콜렉션이 ArrayList로 되어있으니 랜덤하게 카드를 준다.
        int rIdx = (int)(Math.random() * cards.size());//0~9
        return cards.remove(rIdx);
        // return cards.remove((int)(Math.random()*cards.size())); 위에두줄이랑 같은 뜻
    }

    public void showAllCards() {
        for(int i = 0; i<cards.size(); i++) { //카드를 계속 뽑아 수가 줄기 때문에 리터럴값 대신 사이즈로 설정!
            Card c = cards.get(i);
            System.out.println(c);
        }

        //ForEach 위에거랑 같은뜻
        for(Card c: cards) {
            System.out.println(c);
        }
    }
}
/*
- 메소드, 생성자 다른 점 2가지 = 생성자의 특징
    1. 클래스명이랑 이름이 같다.
    2. 리턴(Void,int)타입이 없다.
 */
