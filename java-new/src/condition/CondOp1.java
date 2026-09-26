package condition;

public class CondOp1 {
    public static void main(String[] args) {
        int age = 10;
        String status = (age >= 18) ? "성인" : "미자";
        System.out.println(status);
    }
}
