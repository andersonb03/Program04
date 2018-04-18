public class EmmausSandwichIngredientFactory implements SandwichIngredientFactory {
    
    public Bread createBread() {
	if(item.equals("hamburger"))
            return new WheatWrap();
        else if(item.equals("ham"))
            return new Bun();
        else if(item.equals("chicken"))
            return new WheatWrap();
    }
    
    public Topping[] createTopping() {
        //Topping toppings[] = { new Sprouts(), new Lettuce(), new Cheese(), new Tomato(), new Onion() };

        if(item.equals("hamburger"))
            Topping toppings[] = {new Onion(), new Lettuce()};
        else if(item.equals("ham"))
            Topping toppings[] = {new Cheese()};
        else if(item.equals("chicken"))
            Topping toppings[] = {new Onion(), new Lettuce(), new Tomato()};
        return toppings;
    }
    
    public Condiment[] createCondiment() {
        if(item.equals("hamburger"))
            Condiment condiments[] = {new Mustard()};
        else if(item.equals("ham"))
            Condiment condiments[] = {new Mustard()};
        else if(item.equals("chicken"))
            Condiment condiments[] = {new Mayonnaise()};
        return condiments;
    }
}
