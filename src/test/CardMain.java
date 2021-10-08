package test;

public class CardMain {
    public static void main(String[] args) {
        String[] shape = new String[]{"spade", "heart", "diamond", "clover"};
//      String[] value = new String[]{"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        int sum = 0;

        Card[] cards = new Card[52]; //Card 객체 주소값을 담을 수 있는 52칸을 가진 배열

//        for(int i =0;i<shape.length;i++){
//            for(int z=0;z<value.length;z++){
//                Card c = new Card(shape[i],value[z]);
//                cards[sum] = c;
//                sum++;
//            }
//        }
        for (int i = 0; i < shape.length; i++) {
            for (int z = 1; z <= 13; z++) {
                String value = null;
                switch (z) {
                    case 1: value = "A"; break;
                    case 11: value = "J"; break;
                    case 12: value = "Q"; break;
                    case 13: value = "K"; break;
                    default: value = String.valueOf(z); break;
                }
                Card c = new Card(shape[i], value);
                cards[sum++] = c;
                // cards[sum] = c; sum++; 위에랑 같은 뜻
            }
        }
        //for(Card c : cards) { System.out.println(c); } //아래랑 같은 뜻
        for(int i =0; i< cards.length ;i++){
            Card c = cards[i];
            System.out.println(c);
        }
    }
}
