package quiz.extends1;

public class Movie extends Item{

    private String actor;
    private String director;
    
    public Movie(String name, int price, String director, String actor) {
        super(name, price);
        this.director = director;
        this.actor = actor;
    }

    @Override
    public void print() {
        // System.out.println("이름: " + name + ", 가격: " + price);
        super.print();
        System.out.println("- 감독: " + director + ", 배우: " + actor);
    }
}
