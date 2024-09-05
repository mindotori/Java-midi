package poly.diamond;

public class DiamondMain {

    public static void main(String[] args) {
        InterfaceA a = new Child(); //부모는 자식 담기 가능
        a.mehtodA();
        a.methodCommon();

        InterfaceB b = new Child();
        b.mehtodB();
        b.methodCommon();
    }
}
