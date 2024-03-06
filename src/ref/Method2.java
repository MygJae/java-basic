package ref;

public class Method2 {

    public static void main(String[] args) {
        Student student1 = createStudent("학생1", 15, 90);
        System.out.println("student1 = " + student1);
        Student student2 = createStudent("학생2", 16, 80);
        System.out.println("student2 = " + student2);

        printStudent(student1);
        printStudent(student2);
    }

    static Student createStudent(String name, int age, int grade) {
        Student student = new Student(); // x001         // x002
        System.out.println("student = " + student);
        student.name = name;    // x001.name = "학생1"   // x002.name = "학생2"
        student.age = age;      // x001.age = 15        // x002.age = 16
        student.grade = grade;  // x001.grade = 90      // x002.grade = 80
        return student;
    }

    static void printStudent(Student student) {
        System.out.println("이름: " + student.name + ", 나이: " + student.age + ", 성적: " + student.grade);
    }


}

