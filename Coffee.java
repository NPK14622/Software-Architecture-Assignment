public class Coffee extends Beverages{
    @Override
    void addExtras() {
        System.out.println("Adding vanilla syrup");
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
        System.out.println("Dripping coffee through filter");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding sugar and milk");
    }
}
