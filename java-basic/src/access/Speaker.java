package access;

public class Speaker {

    // private는 모든 외부 호출을 막는다.
    private int volume;

    Speaker(int volume) {
        this.volume = volume;
    } 

    void volumeUp() {
        if (volume >= 100) {
            System.out.println("최대 음량입니다.");
        } else {
            volume += 10;
            System.out.println("볼륨을 10 증가합니다");
        }
    }
    void volumeDown() {
            volume -= 10;
            System.out.println("volumeDown 호출");
    }

    void showVolume() {
        System.out.println(volume);
    }
}