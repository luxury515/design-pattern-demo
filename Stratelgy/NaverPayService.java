package Stratelgy;

public class NaverPayService implements Pay {

    @Override
    public void action() {
        System.out.println("네이버페이로 지불합니다.");
    }
}
