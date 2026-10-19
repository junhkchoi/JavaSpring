package quiz.extends1;

public class Album extends Item{

    private String artist;

    public Album(String name, int price, String artist) {
        super(name, price);
        this.artist = artist;
    }

    @Override
    void print() {
        System.out.println("이름: " + name + ", 가격: " + price);
        System.out.println("아티스트: " + artist);
    }
}
