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
        //
    }
}
