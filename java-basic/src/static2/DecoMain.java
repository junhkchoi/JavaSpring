package static2;

public class DecoMain {
    public static void main(String[] args) {
        DecoUtil decoUtil = new DecoUtil();
        // deco()메서드를 호출하기 위해선 DecoUtil인스턴스를 먼저 생성해야한다
        // 근데 저 클래스엔 멤버 변수도 없고 단순히 기능만 제공한다
        // 인스턴스를 사용하는 이유는 멤버변수를 사용하는 목적이 큰데..
        // 굳이 인스턴스를 생성할 필요가 있나????
        String s = "hello java";
        System.out.println(decoUtil.deco(s));
        
        // static이 붙은 메서드는 객체 생성없이 호출할 수 있다.
        // 따라서 객체의 멤버변수를 사용하지 않으면 static을 활용하라
        String result = DecoUtil2.deco(s);
        System.out.println(result);

        // 그럼 static 메서드가 개꿀아니냐? : X
        // static메서드는 static만 사용할 수 있다.
        // 정적메서드는 정적 메서드나 정적변수만 사용가능하고 인스턴스 변수나 메서드를 사용 불가
        
    }   
}
