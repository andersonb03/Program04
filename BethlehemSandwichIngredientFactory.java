public class BethlehemSandwichIngredientFactory implements SandwichIngredientFactory {
    String item;

    public BethlehemSandwichIngredientFactory(String item){
        this.item = item;
    }
    
    public Bread createBread() {
	if(item.equals("hamburger"))
	        return new Bun();
        else if(item.equals("ham"))
            return new Bun();
        else if(item.equals("chicken"))
            return new WheatWrap();
        else if(item.equals("andersonspecial"))
            return new Bun();
        else if(item.equals("fauxspecial"))
            return new WheatWrap();
        else if(item.equals("mccoolspecial"))
            return new Bun();


        return null;
    }
    
    public Topping[] createTopping() {
        Topping[] toppings = null;
        //Topping toppings[] = { new Sprouts(), new Lettuce(), new Cheese(), new Tomato(), new Onion() };

        if(item.equals("hamburger"))
            toppings = new Topping[] {new Onion()};
        else if(item.equals("ham"))
            toppings = new Topping[] {new Lettuce(), new Tomato()};
        else if(item.equals("chicken"))
            toppings = new Topping[] {new Cheese(), new Lettuce(), new Tomato()};
        else if(item.equals("andersonspecial"))
            toppings = new Topping[] {new Cheese(), new Lettuce(), new Tomato(), new Onion(), new Sprouts()};
        else if(item.equals("fauxspecial"))
            toppings = new Topping[] {new Sprouts()};
        else if(item.equals("mccoolspecial"))
            toppings = new Topping[] {new Cheese(), new Tomato(), new Onion()};
        return toppings;
    }
    
    public Condiment[] createCondiment() {
        Condiment[] condiments = null;
        
        if(item.equals("hamburger"))
            condiments = new Condiment[] {new Mustard(), new Ketchup()};
        else if(item.equals("ham"))
            condiments = new Condiment[] {new Mayonnaise()};
        else if(item.equals("chicken"))
            condiments = new Condiment[] {new Mustard()};
        else if(item.equals("andersonspecial"))
            condiments = new Condiment[] {new Mustard(), new Mayonnaise(), new Ketchup()};
        else if(item.equals("fauxspecial"))
            condiments = new Condiment[] {new Mustard()};
        else if(item.equals("mccoolspecial"))
            condiments = new Condiment[] {new Mustard(), new Ketchup()};
        return condiments;
    }
}



