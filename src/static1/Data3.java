package static1;

public class Data3 {
    public String name; // 인스턴스 변수 (static이 붙지 않은 멤버 변수)
    // static이 붙지 않은 멤버 변수는 인스턴스를 생성해야 사용할 수 있고, 인스턴스에 소속되어 있다.
    public static int count; // 클래스 변수 = 정적 변수 = static 변수
    // static사용 - 메모리 공유
    // 정적 변수는 인스턴스 영역이 아니라 메서드 영역에서 관리한다.
    // static이 붙은 멤버 변수는 인스턴스와 무관하게 클래스에 바로 접근해서 사용할 수 있다


    public Data3(String name){
        this.name = name;
        count++;
    }
}
