package construct;

public class MemberThis {
    String nameField;

    void initMember(String nameParameter){
        nameField = nameParameter; // this. 생략가능 - 매개변수에 nameField없어서 자동으로 멤버변수 가리킴
    }
}
