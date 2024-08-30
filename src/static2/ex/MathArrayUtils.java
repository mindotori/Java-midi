package static2.ex;

public class MathArrayUtils {

    private MathArrayUtils(){
        //private : 인스턴스 생성을 막는다
    }

    public static int sum(int[] values){
        int total = 0;
        for (int value : values) {
            total += value;
        }
        return total;
    }

    public static double average(int[] values){
        return (double) sum(values) / values.length; //소수점 나올 수도 있으니 double로 형변환
    }

    public static int min(int[] values) {
        int minValue = values[0];
        for (int value : values) {
            if(value<minValue){
                minValue = value; //더 작은 것 대입
            }
        }
        return minValue;
    }

    public static int max(int[] values) {
        int maxValue = values[0];
        for (int value : values) {
            if(value>maxValue){
                maxValue = value;
            }
        }
        return maxValue;
    }
}
