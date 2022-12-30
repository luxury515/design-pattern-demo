package Stratelgy;

public class WechatPayService implements Pay {

    @Override
    public void action() {
        System.out.println("위챗페이로 지불합니다.");
    }
}
