package FactoryPattern;

public class Client {
    // simple factory 방식사용시 활성화
//    public static void main(String[] args) {
//        // ProductB 만든다.
//        IProduct product = SimpleFactory.makeProduct("ProductB");
//        product.doSomeThing();
//    }
//    public static void main(String[] args) {
//        // ProductB 만든다.
//        IProduct product = SimpleFactory.makeProduct("FactoryPattern.ProductB");
//        product.doSomeThing();
//    }
        // factory method 방식사용시 활성화
//        public static void main(String[] args) {
//            // ProductA 만듬.
//            FactoryA factoryA = new FactoryA();
//            factoryA.makeProduct().doSomeThing();
//        }

    //Abstractor Factory 방식사용시 활성화
    public static void main(String[] args){
        // nike농구공 , adidas축구공 생산!
        NikeFactoy nikeFactoy = new NikeFactoy();
        AdidasFactory adidasFactory = new AdidasFactory();

        nikeFactoy.makeBasketball().sayBasketball();
        adidasFactory.makeFootball().sayFootball();
    }
}
