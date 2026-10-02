package ref;

public class NullMain2 {
    public static void main(String[] args) {
        // 객체를 참조할때엔 . 을 사용해 접근한다
        // 만약 참조값이 null이면 참조값이 없기 때문에 접근 또한 불가능
        // 이때 . 을 찍으면 어떻게 되냐,
        Data data = null;
        data.value = 10; // NullPointerException 발생
        
    }
}
