package oop1;

public class MusicPlayerMain4 {

    public static void main(String[] args) {
        MusicPlayer player = new MusicPlayer();

        player.on();

        // volume up
        player.volumeUp();

        // volume up
        player.volumeUp();

        // volume down
        player.volumeDown();

        // player status
        player.showStatus();

        // player off
        player.off();
    }
}
