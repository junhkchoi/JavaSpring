package quiz.construct;

public class BookMain {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.displayInfo();

        Book book2 = new Book("Java", "Seo");
        book2.displayInfo();

        Book book3 = new Book("HQ", "CJH", 100);
        book3.displayInfo();


    }
}
