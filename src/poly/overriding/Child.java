package poly.overriding;

public class Child extends  Parent{

    public String value = "child";


    //오버라이딩
    @Override
    public void method() {
        System.out.println("Child.method");
    }
}
