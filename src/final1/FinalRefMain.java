package final1;

public class FinalRefMain {
    public static void main(String[] args) {
        final Data data = new Data(); // 참조값 들어있음(참조형 변수 data에 final이 붙음
        //변수 선언 시점에 참조값을 할당했으므로 더는 참조값을 변경할 수 없다.
       // data = new Data();  - final로 했기 때문에 값 변경 불가(컴파일 오류)

        //참조 대상의 값은 변경 가능
        data.value = 10; //value는 final아님
        System.out.println(data.value);
        data.value = 20;
        System.out.println(data.value);
        // 참조형 변수에 fianl이 붙으면 참조 대상 자체를 다른 대상으로 변경하지 못하는 것이지,
        // 참조하는 대상의 값은 변경할 수 있다.
    }
}
