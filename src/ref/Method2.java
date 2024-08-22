package ref;

public class Method2 {

    public static void main(String[] args) {
        Student student1 = createStudent("학생1",15,90);
        Student student2 = createStudent("학생2",16,80);

        printStudent(student1);
        printStudent(student2);
    }

    static Student createStudent(String name,int age,int grade){
        Student student = new Student();
        student.name = name;
        student.age = age;
        student.grade = grade;
        return student;
    }

    //initStudent: 전달한 학생 객체의 필드에 값을 설정한다.
    static void initStudent(Student student, String name, int age, int grade){
    }

    //printStudent: 전달한 학생 객체의 필드 값을 읽어서 출력한다.
    static void printStudent(Student student){
        System.out.println("이름:"+student.name+" 나이:"+student.age+" 성적:"+student.grade);
    }
}
