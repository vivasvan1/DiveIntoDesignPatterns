package remotes;

import devices.Device;

public class AdvancedRemoteControl extends RemoteControl {

    int volume_before_mute = 0;

    public AdvancedRemoteControl(Device device) {
        super(device);
    }

    public void mute() {
        System.out.println("Remote: mute");
        volume_before_mute = device.getVolume();
        device.setVolume(0);
    }

    public void unmute() {
        System.out.println("Remote: unmute");
        device.setVolume(volume_before_mute);
    }

}
