package oop1;

public class MusicPlayerMain1 {
    // 절차 지향 프로그래밍임. 말 그대로 절차를 중심으로 실행됨
    public static void main(String[] args) {
        int volume = 0;
        boolean isOn = false;

        isOn = true;
        System.out.println("음악 플레이어를 시작합니다");
        volume++;
        System.out.println("볼륨: " + volume);
        volume--;
        System.out.println("볼륨: " + volume);
        volume++;
        
        System.out.println("플레이어 상태확인");
        if (isOn = true) {
            System.out.println("켜짐, 볼륨: " + volume);
        } else {
            System.out.println("꺼짐, 볼륨: " + volume);
        }

        isOn = false;
        System.out.println("플레이어 종료");
    }
}
