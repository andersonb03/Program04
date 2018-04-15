public class EmmausHamburger extends Sandwich {
    SandwichIngredientFactory ingredientFactory;
    
    public EmmausHamburger(SandwichIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }
    
    void makeSandwich() {
        System.out.println("Preparing sandwich " + name);
        bread = ingredientFactory.createBread();
        topping = ingredientFactory.createTopping();
        condiment = ingredientFactory.createCondiment();
    }
}
