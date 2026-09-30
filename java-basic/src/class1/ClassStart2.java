package class1;
import java.util.Scanner;
public class ClassStart2 {

    public static void main(String[] args) {
        Student student1;
        Scanner sc = new Scanner(System.in);

        student1 = new Student(); // 객체, 인스턴스 => 클래스(설계도)를 기반으로 메모리에 올린 실체
        student1.name = "학생1";
        student1.age = 16;
        student1.grade = 80; // 객체에 접근하기 위해서 . 을 사용한다.
        // . 키워드는 변수에 들어있는 참조값을 읽어서 메모리에 존재하는 객체에 접근

        System.out.println(student1); // 주소값을 반환
        // 참조타입은 변수에 참조값(주소를) 저장한다
        // 대표적인 참조타입에는 클래스, 배열, 문자열 등이 있다.
    }
}