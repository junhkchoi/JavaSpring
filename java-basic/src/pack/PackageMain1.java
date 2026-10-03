package pack;

// import pack.a.User;
import pack.a.*; // pack/a/ 아래의 모든 클래스를 호출

public class PackageMain1 {
    public static void main(String[] args) {
        Data data = new Data();
        //import pack.a.User전에는 아래처럼 불러와야함 
        //pack.a.User user = new pack.a.User();

        User user = new User(); // import 사용으로 패키지명 생략가능

    }
}
