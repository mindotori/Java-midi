package final1;

public class FieldInit {

    static final int CONST_VALUE = 10; //상수: static final 키워드 사용 - 대문자 사용, 구분은 _로
    final int value = 10;

    //public FieldInit(int value){
        // this.value = value; // 컴파일 오류 - 초기값 설정했기 때문에 생성자에서도 선언 불가
   // }
}
