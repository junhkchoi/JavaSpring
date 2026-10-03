package quiz.oop;

public class RectangleMain {
    public static void main(String[] args) {
        Rectangle object1 = new Rectangle();

        object1.width = 10;
        object1.height = 5;

        int area = object1.calcArea();
        System.out.println(area);

    }
}
