package access;

public class SpeakerMain {
    public static void main(String[] args) {
        Speaker speaker = new Speaker(50);

        speaker.volumeUp();
        speaker.showVolume();

        System.out.println("volume 필드 직접 접근 수정");
        speaker.volume = 200;
        speaker.showVolume();
    }
}
