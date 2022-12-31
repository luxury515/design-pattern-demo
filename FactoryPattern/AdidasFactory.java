package FactoryPattern;

public class AdidasFactory implements AbstractFactory{
    @Override
    public Basketball makeBasketball() {
        return new AdidasBasketball();
    }

    @Override
    public Football makeFootball() {
        return new AdidasFootball();
    }
}
