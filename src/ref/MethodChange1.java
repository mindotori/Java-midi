package ref;

public class MethodChange1 {

    public static void main(String[] args) {
        int a = 10;
        System.out.println("메서드 호출 전: a = " + a);
        changePrimitive(a); //10
        System.out.println("메서드 호출 후: a = " + a); //10
    }

    static void changePrimitive(int x){ //a를 전달
        x = 20;
    }
}
