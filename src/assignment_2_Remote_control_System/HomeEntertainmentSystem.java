package assignment_2_Remote_control_System;

public class HomeEntertainmentSystem {
    public static void main(String[] args) {
        Device tv = new TVDevice();
        Device dvd = new DVDDevice();

        RemoteControl remote = new BasicRemote(tv);
        remote.powerButton();
        remote.volumeButton(10);
        remote.channelButton(5);

        remote = new BasicRemote(dvd);
        remote.powerButton();
        remote.volumeButton(15);
        remote.channelButton(2);
    }
}
