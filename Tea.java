public class Tea extends Beverages{
    @Override
    void addExtras() {
        System.out.println("Adding extras to tea");
    }

    @Override
    void boilWater() {
        System.out.println("Boiling water");
    }

    @Override
    void pourInCup() {
        System.out.println("Pouring into cup");
    }

    @Override
    void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding lemon");
    }
}
