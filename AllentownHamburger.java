 
public class AllentownHamburger extends Sandwich {
    SandwichIngredientFactory ingredientFactory;
    Bread bread;
    Topping[] topping;
    Condiment[] condiment;

    public AllentownHamburger(SandwichIngredientFactory ingredientFactory) {
	this.ingredientFactory = ingredientFactory;
    }
    
    void makeSandwich() {
        System.out.println("Making " + name);
	bread = ingredientFactory.createBread();
	topping = ingredientFactory.createTopping();
	condiment = ingredientFactory.createCondiment();
    }
}
