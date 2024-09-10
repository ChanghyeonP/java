package oop1;

public class MusicPlayerMain3 {

    public static void main(String[] args) {
        MusicPlayerData data = new MusicPlayerData();

        on(data);

        // volume up
        volumeUp(data);

        // volume up
        volumeUp(data);

        // volume down
        volumeDown(data);

        // player status
        showStatus(data);

        // player off
        off(data);
    }
    // 메서드를 사용하여 기능을 모듈화함 = 코드 중복 제거, 변경 영향 범위 제한, 메서드 이름 추가
    static void showStatus(MusicPlayerData data) {
        if (data.isOn) {
            System.out.println("isOn = " + data.isOn + " volume = " + data.volume);
        } else {
            System.out.println("isOn = " + data.isOn);
        }
    }

    static void volumeDown(MusicPlayerData data) {
        data.volume--;
        System.out.println("volume = " + data.volume);
    }

    private static void volumeUp(MusicPlayerData data) {
        data.volume++;
        System.out.println("volume = " + data.volume);
    }

    static void off(MusicPlayerData data) {
        data.isOn = false;
        System.out.println("player shutdown");
    }

    static void on(MusicPlayerData data) {
        data.isOn = true;
        System.out.println("player start");
    }

}
