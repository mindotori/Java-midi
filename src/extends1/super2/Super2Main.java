package extends1.super2;

public class Super2Main {

    public static void main(String[] args) {
        ClassC classC = new ClassC();
        //최상위 로직 먼저 수행 (부모의 부모 = ClassA)
        // 그 다음 ClassB
        //그 다음 ClassC
    }
}
