package oop1;

public class MusicPlayer {
    int volume = 0;
    boolean isOn = false;

    // 속성과 기능을 하나로 묶어서 필요한 기능을 메서드를 통해 외부에 제공하는 것을 캡슐화라고 함
    void on() {
        isOn = true;
        System.out.println("player start");
    }

    void off() {
        isOn = false;
        System.out.println("player shutdown");
    }

    void volumeUp() {
        volume++;
        System.out.println("volume = " + volume);
    }

    void volumeDown() {
        volume--;
        System.out.println("volume = " + volume);
    }

    void showStatus() {
        if (isOn) {
            System.out.println("isOn = " + isOn + " volume = " + volume);
        } else {
            System.out.println("isOn = " + isOn);
        }
    }
}
