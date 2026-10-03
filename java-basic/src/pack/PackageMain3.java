package pack;

import pack.a.User;
public class PackageMain3 {

    public static void main(String[] args) {
        User userA = new User();
        pack.b.User userB = new pack.b.User();
        // 어쩔 수 없이 같은 이름의 클래스를 사용해야한다면
        // import는 둘 중 하나만 선택할 수 있다.
        // 따라서 자주쓰는 클래스는 불러오고 나머지는 직접 다 쳐야함
    }
}