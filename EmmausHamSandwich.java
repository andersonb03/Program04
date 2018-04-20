import java.util.*;

public class EmmausHamSandwich extends Sandwich {
    SandwichIngredientFactory ingredientFactory;
    Bread bread;
    Topping[] topping;
    Condiment[] condiment;

    public EmmausHamSandwich(SandwichIngredientFactory ingredientFactory) {
	this.ingredientFactory = ingredientFactory;
    }
    
    void makeSandwich() {
        System.out.println("Making " + name);
	bread = ingredientFactory.createBread();
	topping = ingredientFactory.createTopping();
	condiment = ingredientFactory.createCondiment();
    }
    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("---- " + name + " ----\n");
        if (bread != null) {
            result.append(bread);
            result.append("\n");
        }
        if (topping != null) {
            for (int i = 0; i < topping.length; i++) {
                result.append(topping[i]);
                if (i < topping.length-1) {
                    result.append(", ");
                }
            }
            result.append("\n");
        }
        if (condiment != null) {
            for (int i = 0; i < condiment.length; i++) {
                result.append(condiment[i]);
                if (i < condiment.length-1) {
                    result.append(", ");
                }
            }
            result.append("\n");
        }
        return result.toString();
    }
}
