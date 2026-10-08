package static2;
// import static
import static static2.DecoData.*;
public class DecoDataMain {    
    public static void main(String[] args) {
    // main 메서드도 객체 없이 실행가능한 이유도 static메서드 이기 떄문이다!
    // public은 외부의 JVM이 호출해야하기 때문! 따라서 public이 없으면 문법적으론 맞지만 호출 불가
        System.out.println("1. 정적 호출");
        DecoData.staticCall();

        System.out.println("2. 인스턴스 호출 1");
        DecoData data1 = new DecoData();
        data1.instanceMethod();

        System.out.println("3. 인스턴스 호출 2");
        DecoData data2 = new DecoData();
        data2.instanceMethod();

        System.out.println("4. 정적 호출2");
        DecoData.staticCall();

        // 근데 만약 staticCall() 같은 정적 메서드를 자주 호출해야하는 상황이라면
        // 계속 DecoData.staticCall()로 호출해야한다
        // 이때 import static을 사용하면 메서드명만으로도 호출이 가능하다
        staticCall();
        staticCall();
        staticCall();
        staticCall();
    }

}
