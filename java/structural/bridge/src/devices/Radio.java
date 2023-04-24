package devices;

public class Radio implements Device {

    private boolean enabled = false;
    private int volume = 20;
    private int channel = 1;

    @Override
    public boolean isEnabled() {
        return enabled;
    }

    @Override
    public void disable() {
        enabled = false;
    }

    @Override
    public void enable() {
        enabled = true;
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public void setVolume(int percent) {
        if (percent > 100) {
            percent = 100;
        }
        if (percent < 0) {
            percent = 0;
        }
        volume = percent;
    }
    @Override
    public int getChannel() {
        return channel;
    }

    @Override
    public void setChannel(int channel) {
        // Logic to handle invalid channel numbers for RADIO

        this.channel = channel;
    }

}
