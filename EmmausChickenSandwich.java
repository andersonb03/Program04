public class EmmausChickenSandwich extends Sandwich {
    SandwichIngredientFactory ingredientFactory;
    Bread bread;
    Topping[] topping;
    Condiment[] condiment;

    public EmmausChickenSandwich(SandwichIngredientFactory ingredientFactory) {
	this.ingredientFactory = ingredientFactory;
    }

    public double getCost() {
        return 2.50;
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
