public class LivingRoomLight implements Light{
    private int currentBrightness;
    @Override
    public void on() {
        System.out.println("Living Room light is ON at full brightness.");
    }

    @Override
    public void off() {
        System.out.println("Living Room light is OFF.");
    }

    @Override
    public void dim(int level) {
        System.out.println("Living Room light dimmed to "+level+"%");
    }
}
