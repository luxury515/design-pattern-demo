package FactoryPattern.case2;

public class BmwBuilder {
    public static void main(String[] args){

        FactoryBMWX3 factoryBMWX3 = new FactoryBMWX3();
        factoryBMWX3.createEngine();
        factoryBMWX3.createAircondition();

        FactoryBMWX6 factoryBMWX6 = new FactoryBMWX6();
        factoryBMWX6.createEngine();
        factoryBMWX6.createAircondition();
    }
}
