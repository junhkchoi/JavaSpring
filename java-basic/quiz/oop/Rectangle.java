package quiz.oop;

public class Rectangle {
    int width, height;

    int calcArea() {
        return width * height;
    }
    int calcPerimeter() {
        return 2 * (width + height);
    }
    boolean isSquare() {
        if (width == height) {
            return true;
        } else {
            return false;
        }
    }
}
