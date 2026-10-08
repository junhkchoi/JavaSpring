package static1;

public class DataCntMain {
    public static void main(String[] args) {
        Data1 data1 = new Data1("CJ");
        System.out.println(data1.cnt);

        //인스턴스가 새로 생성되므로 cnt는 증가되지 않는다.
        Data1 data2 = new Data1("CJ");
        System.out.println(data2.cnt);
        //생성자를 쓸때마다 cnt를 증가시키고 싶으면 변수 cnt를 공유해야한다

        Counter counter = new Counter();
        Data2 data3 = new Data2("A", counter);
        System.out.println(counter.count);
        // 같은 counter객체의 주소값을 참조함으로 count는 증가함
        Data2 data4 = new Data2("A", counter);
        System.out.println(counter.count);

        Data2 data5 = new Data2("A", counter);
        System.out.println(counter.count);

    }
}
