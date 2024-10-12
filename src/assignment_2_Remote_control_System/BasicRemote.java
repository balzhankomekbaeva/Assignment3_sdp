package assignment_2_Remote_control_System;

public class BasicRemote extends RemoteControl {
    public BasicRemote(Device device) {
        super(device);
    }

    @Override
    public void powerButton() {
        device.powerOn();
        device.powerOff();
    }

    @Override
    public void volumeButton(int volume) {
        device.setVolume(volume);
    }

    @Override
    public void channelButton(int channel) {
        device.setChannel(channel);
    }
}
