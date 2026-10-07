public class MemoryMain1 {

    // 스택구조
    public static void main(String[] args) {
        System.out.println("main start");
        method1(10);
        System.out.println("main end");
    }

    static void method1(int m1) {
        System.out.println("m1  시작");
        int cal = m1 * 2;
        method2(cal);
        System.out.println("m1  끝");
    }
    
    static void method2(int m2) {
        
        System.out.println("m2  시작");
        System.out.println("m2  끝");
    }
}
