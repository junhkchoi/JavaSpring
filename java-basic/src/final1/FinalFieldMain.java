package final1;

public class FinalFieldMain {
    public static void main(String[] args) {
        // 생성자 초기화
        ConstructInit init1 = new ConstructInit(10);
        // ConstructInit init1 = new ConstructInit(20);
        // 변경 불가
        ConstructInit init2 = new ConstructInit(10);

        // 필드 초기화
        FieldInit field1 = new FieldInit(0);
        FieldInit field2 = new FieldInit(0);
        FieldInit field3 = new FieldInit(0);
        System.out.println(field1.value);
        System.out.println(field2.value);
        System.out.println(field3.value);


        System.out.println("상수");
        System.out.println(FieldInit.CONST_VALUE);

    }
}
