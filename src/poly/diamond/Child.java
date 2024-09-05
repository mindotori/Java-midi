package poly.diamond;

public class Child implements InterfaceA, InterfaceB{ //부모 2개
    @Override
    public void mehtodA() {
        System.out.println("Child.methodA");
    }
    @Override
    public void mehtodB() {
        System.out.println("Child.methodB");
    }
    @Override
    public void methodCommon() {
        System.out.println("Child.methodCommon");
    }


}
