package Cha08.Coffee;

public abstract class CaffeineBeverageWithHook {
    final void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()){
            addCondiments();
        }
    }
    abstract void brew();
    abstract void addCondiments();
    void boilWater(){
        System.out.println("Boiling water");
    }
    void pourInCup(){
        System.out.println("Pouring into cup");
    }

    /**
     * 钩子方法，子类根据需要覆盖或者不覆盖
     * @return
     */
    boolean customerWantsCondiments(){
        return true;
    }
}
