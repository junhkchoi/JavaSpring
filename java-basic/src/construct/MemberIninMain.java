package construct;

public class MemberIninMain {
    public static void main(String[] args) {
        MemberInit user1 = new MemberInit();
        user1.createMember("cjh", 20, 10);


        System.out.println("이름: " + user1.name);
    }
    
}
