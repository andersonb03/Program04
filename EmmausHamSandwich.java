import java.util.*;

public class EmmausHamSandwich extends Sandwich {
    SandwichIngredientFactory ingredientFactory;

    public EmmausHamSandwich(SandwichIngredientFactory ingredientFactory) {
	this.ingredientFactory = ingredientFactory;
    }
    
    void makeSandwich() {
        System.out.println(“Making " + name);
	bread = ingredientFactory.createBread();
	topping = ingredientFactory.createTopping();
	condiment = ingredientFactory.createCondiment();
    }
}
