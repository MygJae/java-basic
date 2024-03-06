package class1;

public class ClassStart2 {

    public static void main(String[] args) {
        /**
         * 두 명의 학생 정보 출력
         * 배열
         */

        String[] student = {"학생1", "학생2", "학생3"};
        int[] age = {18, 11, 22};
        int[] grade = {90, 30, 100};

        for (int i = 0; i < student.length; i++) {
            System.out.println("이름: " + student[i] + ", 나이: " + age[i] + ", 성적: " + grade[i]);
        }
    }


}

