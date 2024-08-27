package construct;

public class MemberInit {
    String name;
    int age;
    int grade;

    //추가
     void initMember(String name, int age, int grade){
        this.name = name;  // 매개변수 우선이라 멤버변수에 접근하려면 this. 써야함
        this.age =  age; //멤버변수 접근할 때에는 this. 사용
        this.grade = grade;
    }
}
