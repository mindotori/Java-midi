package access.b;

import access.a.AccessData;

public class AccessOuterMain {
    public static void main(String[] args) {
        public static void main(String[] args) {
            AccessData data = new AccessData();
            //public 호출 가능
            data.publicField = 1;
            data.publicMethod();

            // 패키지 달라서 default 호출 불가능
            //data.defaultField = 2;
            //data.defaultMethod();

            //private 호출 불가 => 컴파일 오류
//        data.privateField = 3;
//        data.privateMethod();

            data.innerAccess();
        }
    }
}
