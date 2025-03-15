public class SmartTv {
    boolean power = false;
    int channel = 1;
    int volume = 10;

    public void power() {
        power = !power;
    }

    public void channelUp() {
        channel++;
    }

    public void channelDown() {
        channel--;
    }

    public void volumeUp() {
        volume++;
    }

    public void volumeDown() {
        volume--;
    }

    public void setChannel(int newChannel) {
        channel = newChannel;
    }



}
