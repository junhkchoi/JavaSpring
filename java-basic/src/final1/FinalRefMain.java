package final1;

public class FinalRefMain {
    public static void main(String[] args) {
        
        final Data data = new Data(); // 참조형
        // data = new Data(); final이므로 변경 불가

        data.value = 10;
        System.out.println(data.value);
        data.value = 20;
        System.out.println(data.value);
        // 참조 대상의 데이터는 변경 가능
        // 즉 data 변수의 값만 못바꾸는것..
    }
}
