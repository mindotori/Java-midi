package class1;

public class StudentClass5 {

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

        //생성과 선언을 동시에 하여 최적화
        //Student[] students = new Student[]{student1,student2};도 가능
        Student[] students = {student1,student2};

//        for(int i=0;i<students.length;i++){
//            System.out.println("이름:" + students[i].name + " 나이"+students[i].age +" 성적:"+students[i].grade);
//        }

        for(int i=0;i<students.length;i++){
            Student s = students[i];
            System.out.println("이름:" + s.name + " 나이"+s.age +" 성적:"+s.grade);
        }

        //향상된 for문
        for(Student s: students){
            System.out.println("이름:" + s.name + " 나이"+s.age +" 성적:"+s.grade);
        }

    }
}
