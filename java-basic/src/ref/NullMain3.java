package ref;

public class NullMain3 {
    public static void main(String[] args) {
        
        BigData bigData = new BigData();

        System.out.println(bigData); // x001
        System.out.println(bigData.count); // 멤버변수 0으로 초기화
        System.out.println(bigData.data); // 멤버변수 null로 초기화

        //System.out.println(bigData.data.value); 
        // null의 value를 접근 -> 널포인트익셉션예외발생
        // 따라서 해결법 : 참조값을 주면된다.
        bigData.data = new Data(); // x002
        System.out.println(bigData.data);  
        System.out.println(bigData.data.value); //x002.value 

    }
    
}
