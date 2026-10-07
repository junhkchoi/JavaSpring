public class MemoryMain2 {
    public static void main(String[] args) {
        System.out.println("main start");
        method1();
        System.out.println("main end");
    }
    static void method1() {
        System.out.println("m1  시작");
        Data data1 = new Data(10);
        method2(data1);
        System.out.println("m1  끝");
    }
    
    static void method2(Data data2) {
        System.out.println("m2  시작");
        System.out.println("data.value=" + data2.getValue());
        System.out.println("m2  끝");
    }
}
