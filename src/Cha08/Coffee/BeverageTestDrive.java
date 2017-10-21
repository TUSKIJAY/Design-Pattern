package Cha08.Coffee;

public class BeverageTestDrive {
    public static void main(String[] args){
        Tea tea = new Tea();
        Coffe coffe = new Coffe();

        System.out.println("\nMaking tea...");
        tea.prepareRecipe();

        System.out.println("\nMaking coffee...");
        coffe.prepareRecipe();
    }
}
