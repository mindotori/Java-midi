package static1;

public class DataCountMain1 {
 //객체를 생성할 때마다 Data1 인스턴스는 새로 생성. 그리고 인스턴스에 포함된 count 변수도 새로 만들어짐
    public static void main(String[] args) {
        Data1 data1 = new Data1("A");
        System.out.println("A count="+data1.count);

        Data1 data2 = new Data1("B");
        System.out.println("A count="+data1.count);

        Data1 data3 = new Data1("C");
        System.out.println("A count="+data1.count);
    }
}
