package static2;

public class DecoMain2 {

    public static void main(String[] args) {
        String s = "hello java";
        //인스턴스 생성 없이 바로 호출
        String deco = DecoUtil2.deco(s);

        System.out.println("before "+s);
        System.out.println("After "+deco);
    }
}
