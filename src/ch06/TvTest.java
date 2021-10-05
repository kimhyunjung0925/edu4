package ch06;

public class TvTest {
    public static void main(String[] args) {
        TvSettersGetters tv = new TvSettersGetters();
        tv.setBrand ("삼성");
        tv.setInch(50);
        System.out.println("tv brand : " + tv.getBrand());
        System.out.println("tv inch : " + tv.getInch());
        //tv.brand = "삼성";

        TvSettersGetters tv2 = new TvSettersGetters();
        tv2.setBrand("LG");
        tv2.setInch(30);
        System.out.println("tv2 brand : " + tv2.getBrand());
        System.out.println("tv2 inch : " + tv2.getInch());
        //tv.brand = "LG";
    }
}
