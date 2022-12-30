package StratelgyPattern;

public class Main {
    public static void main(String[] args) {
        System.out.println("======지불 해보겠습니다!");

        BuyItem buyItem = new BuyItem(new KakaoPayService());
        buyItem.payAction();

        BuyItem buyItem2 = new BuyItem(new NaverPayService());
        buyItem2.payAction();

        BuyItem buyItem3 = new BuyItem(new WechatPayService());
        buyItem3.payAction();
    }
}
