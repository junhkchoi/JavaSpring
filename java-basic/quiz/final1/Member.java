package quiz.final1;

public class Member {
    private final String id;
    private String name;

    public Member(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public void changeData(String id, String name) {
        // this.id = id; id변수는 final이므로 변경 X
        this.name = name;
    }
}
