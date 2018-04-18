public class EmmausChickenSandwich extends Sandwich {
    SandwichIngredientFactory ingredientFactory;

    public EmmausChickenSandwich(SandwichIngredientFactory ingredientFactory) {
	this.ingredientFactory = ingredientFactory;
    }
    
    void makeSandwich() {
        System.out.println(“Making " + name);
	bread = ingredientFactory.createBread();
	topping = ingredientFactory.createTopping();
	condiment = ingredientFactory.createCondiment();
    }
}
