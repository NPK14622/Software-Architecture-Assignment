public class LightDimCommand implements Command{
    private Light light;
    private int currentBrightness;
    private int newBrightness;
    public LightDimCommand(Light light,int newBrightness){
        this.light = light;
        this.newBrightness = newBrightness;
    }
    @Override
    public void execute() {
        currentBrightness = light.getCurrentBrightness();
        light.dim(newBrightness);
    }

    @Override
    public void undo() {
        light.dim(currentBrightness);
    }
}
