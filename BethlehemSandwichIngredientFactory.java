"public class BethlehemSandwichIngredientFactory implements SandwichIngredientFactory {
    
    public Bread createBread() {
	if(item.equals("hamburger"))
            return new Bun();
        else if(item.equals("ham"))
            return new Bun();
        else if(item.equals("chicken"))
            return new WheatWrap();
    }
    
    public Topping[] createTopping() {
        //Topping toppings[] = { new Sprouts(), new Lettuce(), new Cheese(), new Tomato(), new Onion() };

        if(item.equals("hamburger"))
            Topping toppings[] = {new Onion()};
        else if(item.equals("ham"))
            Topping toppings[] = {new Lettuce(), new Tomato()};
        else if(item.equals("chicken"))
            Topping toppings[] = {new Cheese(), new Lettuce(), new Tomato()};
        return toppings;
    }
    
    public Condiment[] createCondiment() {
        if(item.equals("hamburger"))
            Condiment condiments[] = {new Mustard(), new Ketchup() };
        else if(item.equals("ham"))
            Condiment condiments[] = {new Mayonnaise()};
        else if(item.equals("chicken"))
            Condiment condiments[] = {new Mustard()};
        return condiments;
    }
}
