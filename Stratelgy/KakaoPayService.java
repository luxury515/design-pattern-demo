package Stratelgy;

public class KakaoPayService implements Pay{
    @Override
    public void action() {
        System.out.println("카카오페이로 지불합니다.");
    }
}
