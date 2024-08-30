package static2.ex;

public class Car {
    public static int totalCars; // 공통 값이니 static 사용 **
    private String name; // 공통이 아님 - 인스턴스 변


    public Car(String name){ //생성자
        System.out.println("차량 구입, 이름: "+name);
        this.name = name;
        totalCars++;
    }

    public static void showTotalCars(){ // static만 쓰기 때문에 static으로 만들자
        System.out.println("구매한 차량 수: " + totalCars);
    }
}
