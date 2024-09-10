package oop1;

public class MusicPlayerMain1 {

    public static void main(String[] args) {
        int volume = 0;
        boolean isOn = false;

        isOn = true;
        System.out.println("player start");

        // volume up
        volume++;
        System.out.println("volume = " + volume);

        // volume up
        volume++;
        System.out.println("volume = " + volume);

        // volume down
        volume--;
        System.out.println("volume = " + volume);

        // player status
        if (isOn) {
            System.out.println("isOn = " + isOn + " volume = " + volume);
        } else {
            System.out.println("isOn = " + isOn);
        }

        // player off
        isOn = false;
        System.out.println("player shutdown");
    }
}
