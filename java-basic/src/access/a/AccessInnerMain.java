package access.a;

public class AccessInnerMain {
    public static void main(String[] args) {
        AccessData data = new AccessData();

        // public - 모든 외부호출 허용
        data.publicField = 1;
        data.publicMethod();

        // 같은 패키지 - 호출가능
        data.defaultField = 2;
        data.defaultMethod();

        // 호출 불가
        // data.privateField = 3;
        // data.privateMethod();

        data.innerAccess();
    }
}
