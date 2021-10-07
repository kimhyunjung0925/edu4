package hyunjung;

import blackjack.Card;

public class CardDeckArray {
    public static void main(String[] args) {
        Card[] Card = new Card[52];
        int sum = 0;
        String[] patters = new String[]{"스페이드", "하트", "클럽", "다이아몬드"};
        for (int i = 0; i < 3; i++) {
            for (int z = 1; z <= 13; z++) {
                String denomination = null;
                switch (z) {
                    case 1:
                        denomination = "A";
                        break;
                    case 11:
                        denomination = "J";
                        break;
                    case 12:
                        denomination = "Q";
                        break;
                    case 13:
                        denomination = "K";
                        break;

                    default:
                        denomination = String.valueOf(z); //2~10은정수를 문자열로 변경 (z + "")
                }
                blackjack.Card c = new Card(patters[i], denomination);
                sum += i;
                System.out.println(c);
            }
        }
    }
}
