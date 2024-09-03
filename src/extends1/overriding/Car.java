package extends1.overriding;

public class Car {

    public void move(){
        System.out.println("차를 이동합니다.");
    }

    //추가 - 자식들은 모두 이 기능을 물려받게 된다.(상속)
    public void openDoor() {
        System.out.println("문을 엽니다.");
    }
}
