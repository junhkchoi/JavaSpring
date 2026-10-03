package oop1;

public class MusicPlayer {

    // 뮤직 플레이어 클래스안에 속성(멤버변수)과 기능(메서드)가 모두 들어있다
    // 이렇게 속성과 기능을 묶어서 제공하는 것을 캡슐화라고 한다.
    
    int volume = 0;
    boolean isOn = false;
    
    void on() {
        isOn = true;
        System.out.println("음악 플레이어를 시작합니다");
    }
    void off() {
        isOn = false;
        System.out.println("음악 플레이어를 종료합니다");
    }
    void volumeUP() {
        volume++;
        System.out.println("볼륨: " + volume);
    }
    void volumeDown() {
        volume--;
        System.out.println("볼륨: " + volume);
    }
    void showStatus() {
        if (isOn = true) {
            on();
        } else {
            off();
        }
    }
}
