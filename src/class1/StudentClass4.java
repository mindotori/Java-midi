package class1;

public class StudentClass4 {

    public static void main(String[] args) {
        Student student1;
        student1 = new Student(); //학생을 실제 메모리에 만든다 //x001 주소
        student1.name = "학생1"; // 클래스 만든 것을 .을 통해 접근 가능
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student(); //x002 주소
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        Student[] students = new Student[2]; //2개짜리 배열
        //배열에 객체를 보관
        //자바에서 대입은 항상 변수에 들어 있는 값을 복사해서 저장
        students[0] = student1;
        students[1] = student2;


        System.out.println("이름:"+students[0].name+" 나이:"+students[0].age+" 성적:"+students[0].grade);
        System.out.println("이름:"+students[1].name+" 나이:"+students[1].age+" 성적:"+students[1].grade);

    }
}
