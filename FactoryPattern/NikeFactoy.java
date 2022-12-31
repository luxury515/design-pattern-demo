package FactoryPattern;

public class NikeFactoy implements AbstractFactory{
    @Override
    public Basketball makeBasketball() {
        return new NikeBasketball();
    }

    @Override
    public Football makeFootball() {
        return new NikeFootball();
    }
}
