package ref;

public class VarChange2 {
    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;

        Data dataB = dataA;

        System.out.println("A: " + dataA);//같다
        System.out.println("B: " + dataB);//같다
        System.out.println("A.value: " + dataA.value); //10
        System.out.println("B.value " + dataB.value); //10
        System.out.println();
        
        dataA.value = 20;
        System.out.println("A.value: " + dataA.value); //20
        System.out.println("B.value " + dataB.value); //20
    }
}
