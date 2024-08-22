public class KitchenRoomLight implements Light{
    private int currentBrightness;
    @Override
    public void on() {
        System.out.println("Kitchen Room light is ON at full brightness.");
    }

    @Override
    public void off() {
        System.out.println("Kitchen Room light is OFF.");
    }

    @Override
    public void dim(int level) {
        System.out.println("Kitchen Room light dimmed to "+level+"%");
    }
}
