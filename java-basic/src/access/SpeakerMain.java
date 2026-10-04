package access;

public class SpeakerMain {
    public static void main(String[] args) {
        Speaker speaker = new Speaker(50);

        speaker.volumeUp();
        speaker.showVolume();

        System.out.println("volume 필드 직접 접근 수정 불가");
        // speaker.volume = 200;
        // volume은 private로 선언되었으므로 호출 불가.
        speaker.showVolume();
    }
}
