package final1;

public class FieldInit {

    static final int CONST_VALUE = 10;
    final int value = 10;

    public FieldInit(int value){
        // this.value = value; // 초기값 설정했기 때문에 생성자에서도 선언 불가
    }
}
