package blackjack;

import java.util.Scanner;

public class Game {
    public void play() {
        Scanner scan = new Scanner(System.in);
        CardDeck cd = new CardDeck();
        Dealer dealer = new Dealer();
        Gamer gamer = new Gamer();
        // Rule rule = new Rule(); //rule에서 static으로 객체화 해서 안써도 됨, static 안했으면 써야함! extends도 되어있고

        for(int i=0;i<2;i++) {
            dealer.receiveCard(cd.getCard());
            gamer.receiveCard(cd.getCard());
        }


        dealer.moreCard(cd);
        while(true) {
            System.out.println("---나의 카드 리스트---");
            gamer.showAllMyCards();
            System.out.println("카드를 더 뽑으시겠습니까? (y/n)");
            String yn = scan.next();
            if("n".equals(yn)) { break; }
            gamer.receiveCard(cd.getCard());
        }
        System.out.println("---딜러 카드 리스트---");
        dealer.showAllMyCards();
        Rule.getWinner(dealer,gamer);
    }
}
