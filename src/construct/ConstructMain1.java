package construct;

public class ConstructMain1 {

    public static void main(String[] args) {
        MemberConstruct member1 = new MemberConstruct("user1", 18, 20);
        MemberConstruct member2 = new MemberConstruct("user2", 18, 20);

        MemberConstruct[] members = {member1, member2};

        for (MemberConstruct member : members) {
            System.out.println("호출 name= " + member.name + ", age= " + member.age + ", grade= " + member.grade);
        }

    }


}

