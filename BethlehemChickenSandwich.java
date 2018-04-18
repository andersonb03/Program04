public class BethlehemChickenSandwich extends Sandwich {
    SandwichIngredientFactory ingredientFactory;

    public BethlehemChickenSandwich(SandwichIngredientFactory ingredientFactory) {
	this.ingredientFactory = ingredientFactory;
    }
    
    void makeSandwich() {
        System.out.println(“Making " + name);
	bread = ingredientFactory.createBread();
	topping = ingredientFactory.createTopping();
	condiment = ingredientFactory.createCondiment();
    }
}
