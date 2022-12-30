package StratelgyPattern;

public class BuyItem {
    private Pay pay ;

    public BuyItem(Pay pay){
        this.pay = pay;
    }
    public void payAction(){
        pay.action();
    }
    public void setPay(Pay pay){
        this.pay = pay;
    }
}
