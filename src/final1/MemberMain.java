package final1;

public class MemberMain {

    public static void main(String[] args) {
        Member member = new Member("myId","Mintol");
        member.print();
        member.changeData("myId2","tolMin");
        member.print();
        //id는 fianl이기 때문에 변경되지 않는다.
    }
}
