

import devices.Radio;
import devices.TV;
import remotes.AdvancedRemoteControl;
import remotes.RemoteControl;

public class App {
    public static void main(String[] args) throws Exception {
        // All devices that are compatible with Device interface can be used
        // by the RemoteControl class and AdvancedRemoteControl class.

        TV tv = new TV();
        RemoteControl remote = new RemoteControl(tv);
        remote.togglePower();

        // remote.mute(); // Error: mute() is not defined in RemoteControl class.


        Radio radio = new Radio();
        AdvancedRemoteControl advanced_remote = new AdvancedRemoteControl(radio);
        advanced_remote.togglePower();
        advanced_remote.mute();
    }
}
