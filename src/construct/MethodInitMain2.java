package construct;

public class MethodInitMain2 {

    public static void main(String[] args) {


        MemberInit member1 = initMember("user1", 20, 90);
        MemberInit member2 = initMember("user2", 30, 70);

        MemberInit[] members = {member1, member2};

        for (MemberInit member : members) {
            System.out.println("이름: " + member.name + ", 나이: " + member.age + ", 성적: " + member.grade);
        }
    }

    static MemberInit initMember(String name, int age, int grade) {
        MemberInit memberInit = new MemberInit();
        memberInit.name = name;
        memberInit.age = age;
        memberInit.grade = grade;
        return memberInit;
    }


}

