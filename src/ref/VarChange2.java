package ref;

public class VarChange2 {

    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        Data dataB = dataA;

        System.out.println("dataA 참조값=" + dataA);   // 참조값only
        System.out.println("dataB 참조값=" + dataB);  // 참조값only
        System.out.println("dataA.value = " +  dataA.value);
        System.out.println("dataB.value = " +  dataB.value);

        //dataA 변경
        dataA.value = 20;
        System.out.println("변경 data.value = 20");
        System.out.println("dataA.value = " +  dataA.value);
        System.out.println("dataB.value = " +  dataB.value);

        //dataB 변경
        dataB.value = 30;
        System.out.println("변경 dataB.value = 30");
        System.out.println("dataA.value = " +  dataA.value);
        System.out.println("dataB.value = " +  dataB.value);
    }
}
