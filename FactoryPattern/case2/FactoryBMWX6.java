package FactoryPattern.case2;

public class FactoryBMWX6 implements AbstractFactory{
    @Override
    public Engine createEngine() {
        return new EngineB();
    }

    @Override
    public Aircondition createAircondition() {
        return new AirconditionB();
    }
}
