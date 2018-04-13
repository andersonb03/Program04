public class EmmausSandwichIngredientFactory implements SandwichIngredientFactory {
    
    public Bread createBread() {
        return new Bun();
    }
    
    public Topping[] createTopping() {
        Topping toppings[] = { new Sprouts, new Lettuce(), new Cheese(), new Tomato(), new Onion() };
        return toppings;
    }
    
    public Condiment[] createCondiment() {
        Condiment condiments[] = { new Mayonnaise(), new Mustard(), new Ketchup() };
        return condiments;
    }
}
