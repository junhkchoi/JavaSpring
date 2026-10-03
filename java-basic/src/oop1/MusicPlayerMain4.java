package oop1;

public class MusicPlayerMain4 {
    public static void main(String[] args) {
        MusicPlayer player = new MusicPlayer();

        player.on();
        player.volumeUP();
        player.volumeUP();
        player.volumeDown();
        player.showStatus();
        player.off();
        
    }
}
