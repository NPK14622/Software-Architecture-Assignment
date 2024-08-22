public class LivingRoomLight implements Light{
    private int currentBrightness;
    @Override
    public void on() {
        currentBrightness = 100;//Assuming current kitchen room light's brightness is 100 when switch on
        System.out.println("Living Room light is ON at full brightness.");
    }

    @Override
    public void off() {
        currentBrightness = 0;//Assuming when switch off brightness is 0
        System.out.println("Living Room light is OFF.");
    }

    @Override
    public void dim(int level) {
        currentBrightness = level;
        System.out.println("Living Room light dimmed to "+currentBrightness+"%");
    }

    public int getCurrentBrightness() {
        return currentBrightness;
    }
}
