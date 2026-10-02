package oop1;

public class MusicPlayerMain2 {
    // 절차 지향 프로그래밍임. 말 그대로 절차를 중심으로 실행됨
    public static void main(String[] args) {
        MusicPlayerData data = new MusicPlayerData();

        // 모듈화
        on(data);
        volumeUP(data);
        volumeDown(data);        
        volumeUP(data);
        System.out.println("플레이어 상태확인");
        showStatus(data);
        off(data);

        //절차지향의 한계: 데이터와 메서드가 두곳으로 분리됨.
        //유지보수의 복잡함. 데이터와 메서드는 밀접한 관계가 있기 때문에 묶어서 사용하는게 좋다.
    }
    static void volumeUP(MusicPlayerData data) {
        data.volume++;
        System.out.println("볼륨: " + data.volume);
    }
    static void volumeDown(MusicPlayerData data) {
        data.volume--;
        System.out.println("볼륨: " + data.volume);
    }
    static void on(MusicPlayerData data) {
        data.isOn = true;
        System.out.println("켜짐, 볼륨: " + data.volume);
    }
    static void off(MusicPlayerData data) {
        data.isOn = false;
        System.out.println("꺼짐");
    }
    static void showStatus(MusicPlayerData data) {
        if (data.isOn = true) {
            on(data);
        } else {
            off(data);
        }
    }
}
