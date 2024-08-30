package static2.ex;

public class Car {
    public static int totalCars;
    private String name;


    public Car(String name){ //생성자
        System.out.println("차량 구입, 이름: "+name);
        this.name = name;
        totalCars++;
    }

    public static void showTotalCars(){
        System.out.println("구매한 차량 수: " + totalCars);
    }
}
