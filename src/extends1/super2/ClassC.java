package extends1.super2;

public class ClassC extends ClassB{

    public ClassC(){
        //super() ----- X
        super(10,20); //부모에 기본생성자가 없으면 개발자가 직접 super호출해줘야함
        System.out.println("ClassC 생성자");
    }
}
