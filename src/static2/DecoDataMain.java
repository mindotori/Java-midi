package static2;

//import static static2.DecoData.*; // 임포트 스태틱 (클래스명 생략가능)
import static static2.DecoData.*;
public class DecoDataMain {

    public static void main(String[] args) {
        System.out.println("1. 정적 호출");
        DecoData.staticCall(); //임포트하지 않은 경우 (정석)
        staticCall(); // 임포트 스태틱
        staticCall();
        staticCall();
        staticCall();

        System.out.println("2. 인스턴스 호출1");
        DecoData data1 = new DecoData();
        data1.instanceCall();

        System.out.println("3. 인스턴스 호출2");
        DecoData data2 = new DecoData();
        data2.instanceCall();

        //추가
        //인스턴스를 통한 접근
        DecoData data3 = new DecoData();
        data3.staticCall();//밑과 똑같은 결과지만 권장하지 않음

        //클래스를 통한 접근
        staticCall(); //스태틱 메서드

    }
}
