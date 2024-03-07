package oop1;

public class MusicPlayer {
    int volume2;
    boolean isOn;

    void on() {
        isOn = true;
        System.out.println("음악 플레이어를 시작합니다.");
    }

    void off() {
        isOn = false;
        System.out.println("음악 플레이어 종료합니다.");
    }

    void volumeUp() {
        volume2++;
        System.out.println("음악 플레이어 볼륨: " + volume2);
    }

    void volumeDown() {
        volume2--;
        System.out.println("음악 플레이어 볼륨: " + volume2);
    }

    void showStatus() {
        System.out.println("음악 플레이어 상태 확인");
        if (isOn) {
            System.out.println("void volume = " + volume2);
        } else {
            System.out.println("음악 플레이어 OFF");
        }
    }


}

