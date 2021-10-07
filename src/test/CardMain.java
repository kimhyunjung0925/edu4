package test;

public class CardMain {
    public static void main(String[] args) {
        String[] shape = new String[]{"spade", "heart", "diamond", "clover"};
        //String[] value = new String[]{"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        int sum = 0;

        Card[] cards = new Card[52];

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
                    case 1:
                        value = "A";
                        break;
                    case 11:
                        value = "J";
                        break;
                    case 12:
                        value = "Q";
                        break;
                    case 13:
                        value = "K";
                        break;
                    default:
                        value = String.valueOf(z);
                        break;
                }
                Card c = new Card(shape[i], value);
                cards[sum] = c;
                sum++;
            }
        }

        for(int i =0; i< cards.length ;i++){
            Card c = cards[i];
            System.out.println(c);

        }
    }
}

