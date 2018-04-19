public class EmmausSandwichIngredientFactory implements SandwichIngredientFactory {
    String item;

    public EmmausSandwichIngredientFactory(String item){
        this.item = item;
    }
    
    public Bread createBread() {
	if(item.equals("hamburger"))
            return new WheatWrap();
        else if(item.equals("ham"))
            return new Bun();
        else if(item.equals("chicken"))
            return new WheatWrap();
        return null;
    }
    
    public Topping[] createTopping() {
        Topping[] toppings = null;
        //Topping toppings[] = { new Sprouts(), new Lettuce(), new Cheese(), new Tomato(), new Onion() };

        if(item.equals("hamburger"))
            toppings = new Topping[] {new Onion(), new Lettuce()};
        else if(item.equals("ham"))
            toppings = new Topping[] {new Cheese()};
        else if(item.equals("chicken"))
            toppings = new Topping[] {new Onion(), new Lettuce(), new Tomato()};
        return toppings;
    }
    
    public Condiment[] createCondiment() {
        Condiment[] condiments = null;
        
        if(item.equals("hamburger"))
            condiments = new Condiment[] {new Mustard()};
        else if(item.equals("ham"))
            condiments = new Condiment[] {new Mustard()};
        else if(item.equals("chicken"))
            condiments = new Condiment[] {new Mayonnaise()};
        return condiments;
    }
}
