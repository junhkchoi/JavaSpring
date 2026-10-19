package quiz.extends1;

public class Book extends Item {
    
    private String author;
    private String isbn;

    public Book(String name, int price, String author, String isbn) {
        super(name, price);
        this.author = author;
        this.isbn = isbn;
    }

    @Override
    public void print() {
        // System.out.println("이름: " + name + ", 가격: " + price);
        // Item 클래스의 멤버 변수가 private이기 때문에 호출불가
        super.print();
        System.out.println("- 저자: " + author + ", isbn: " + isbn);
    }
}
