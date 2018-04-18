public class AllentownSandwichIngredientFactory implements SandwichIngredientFactory {
    
    public Bread createBread() {
        return new Bun();
    }
    
    public Topping[] createTopping() {
        //Topping toppings[] = { new Sprouts(), new Lettuce(), new Cheese(), new Tomato(), new Onion() };

        if(item.equals("hamburger"))
            Topping toppings[] = {new Lettuce(), new Cheese(), new Tomato()};
        else if(item.equals("ham"))
            Topping toppings[] = {new Cheese(), new Tomato(), new Onion()};
        else if(item.equals("chicken"))
            Topping toppings[] = {new Lettuce()};
        return toppings;
    }
    
    public Condiment[] createCondiment() {
        if(item.equals("hamburger"))
            Condiment condiments[] = {new Mayonnaise()};
        else if(item.equals("ham"))
            Condiment condiments[] = {};
        else if(item.equals("chicken"))
            Condiment condiments[] = {new Mayonnaise()};
        return condiments;
    }
}
