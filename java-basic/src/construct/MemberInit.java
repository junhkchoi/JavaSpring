package construct;

public class MemberInit {

    String name;
    int age, grade;
    String sex;


    // 아래는 같은 기능을 하는 코드이다.
    // 그런데 메서드의 매개변수와 클래스의 멤버변수의 이름이 동일하다.
    // 이 경우, 멤버 변수보다 매개변수가 코드 블럭의 더 안쪽에 있기 때문에 매개변수가 더 우선순위를 가진다.
    // 멤버 변수에 접근하려면 앞에 this. 즉, 인스턴스 자신의 참조값을 가리키도록 한다.
    void createMember(String name, int age, int grade, String manOrFemale) {
        this.name = name;
        this.age = age;
        this.grade = grade;

        // 이런 식으로 멤버변수 != 매개변수이면 구분이 되므로 this를 넣어도 되고 안넣어도 됨! 
        sex = manOrFemale; 
        // this.sex = manOrFemale;
    }
    /* 
    void createMember(MemberInit member, String name, int age, int grade) {
        member.name = name;
        member.age = age;
        member.grade = grade;
    }
    */
}

