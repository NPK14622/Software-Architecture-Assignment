public abstract class Beverages {

    private boolean wantsExtras;
    public void setWantsExtras(boolean wantsExtras){
        this.wantsExtras = wantsExtras;
    }

    abstract void addExtras();
    abstract void boilWater();
    abstract void pourInCup();
    abstract void brew();
    abstract void addCondiments();
    public void finalTemplateMethod(){
        boilWater();
        brew();
        pourInCup();
        addCondiments();
        if(wantsExtras == true){
            addExtras();
        }
    }
}
