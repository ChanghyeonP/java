package oop1;

public class MusicPlayerMain2 {

    public static void main(String[] args) {
        MusicPlayerData data = new MusicPlayerData();

        data.isOn = true;
        System.out.println("player start");

        // volume up
        data.volume++;
        System.out.println("volume = " + data.volume);

        // volume up
        data.volume++;
        System.out.println("volume = " + data.volume);

        // volume down
        data.volume--;
        System.out.println("volume = " + data.volume);

        // player status
        if (data.isOn) {
            System.out.println("isOn = " + data.isOn + " volume = " + data.volume);
        } else {
            System.out.println("isOn = " + data.isOn);
        }

        // player off
        data.isOn = false;
        System.out.println("player shutdown");
    }
}
