package poly.basic;

public class CastingMain6 {

    public static void main(String[] args) {
        Parent parent1 = new Parent();
        System.out.println("parent1 호출");
        call(parent1);

        Parent parent2 = new Child();
        System.out.println("parent2 호출");
        call(parent2);
    }

    //instanceof키워드는 오른쪽에 있는 타입이 왼쪽에 있는 인스턴스의 타입이 들어갈 수 있는지 대입해보면 된다.
    private static void call(Parent parent){
        parent.parentMethod();
        //Child의 인스턴스인 경우 childMethod() 실행
        if(parent instanceof Child child){
            System.out.println("Child 인스턴스 맞음");
            child.childMethod();
        }
    }

}
