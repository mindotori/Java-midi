package static2.ex;

import static static2.ex.MathArrayUtils.*; // 스태틱 임포트

public class MathArrayUtilsMain {


    public static void main(String[] args) {
        int[] values = {1,2,3,4,5};
        //스태틱 임포트 전
//        System.out.println("sum = " + MathArrayUtils.sum(values));
//        System.out.println("average = " + MathArrayUtils.average(values));
//        System.out.println("min = " + MathArrayUtils.min(values));
//        System.out.println("max = " + MathArrayUtils.max(values));
        //스태틱 임포트 후 (위 아래 같은 코드)
        System.out.println("sum = " + sum(values));
        System.out.println("average = " + average(values));
        System.out.println("min = " + min(values));
        System.out.println("max = " + max(values));
    }
}
