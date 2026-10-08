package static1;

public class DataCntMain3 {
    public static void main(String[] args) {
        //Data3클래스에서 count는 static변수이다
        Data3 data1 = new Data3("CJ");
        System.out.println(Data3.count);
        // 특이한게 객체에 접근하는게 아니라, 클래스 자체에 접근
        Data3 data2 = new Data3("CJ");
        System.out.println(Data3.count);
        // static이 붙은 멤버변수는 메서드 영역에서 관리한다
        // 객체를 생성한다해도 힙 영역에서 count가 생성되지 않음
        // 사실 인스턴스에서 접근이 가능하지만, 클래스로 접근하는게 관례임
        // 인스턴스 변수처럼 보일 수 있기 때문
        

    }
}
