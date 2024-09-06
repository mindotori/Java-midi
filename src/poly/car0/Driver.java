package poly.car0;

public class Driver {
    //이 Driver클래스는 K3Car와 Model3Car를 알고있다 -> 둘에 의존한다 (의존관계)
    private K3Car k3Car; //참조형의 기본값은 null
    private Model3Car model3Car; //추가

    public void serK3Car(K3Car k3Car){
        this.k3Car = k3Car;
    }

    //추가
    public void setModel3Car(Model3Car model3Car){
        this.model3Car = model3Car;
    }

    public void drive(){
        System.out.println("자동차를 운전합니다.");
        if(k3Car!=null) {
            k3Car.startEngine();
            k3Car.pressAccelerator();
            k3Car.offEngine();
        } else if(model3Car!= null){
            model3Car.startEngine();
            model3Car.pressAccelerator();
            model3Car.offEngine();
        }
    }
}
