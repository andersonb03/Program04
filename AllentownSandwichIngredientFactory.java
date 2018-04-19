public class AllentownSandwichIngredientFactory implements SandwichIngredientFactory {
    String item;

    public AllentownSandwichIngredientFactory(String item){
        this.item = item;
    }
    
    public Bread createBread() {
        return new Bun();
    }
    
    public Topping[] createTopping() {
        Topping[] toppings = null;
        //Topping toppings[] = { new Sprouts(), new Lettuce(), new Cheese(), new Tomato(), new Onion() };

        if(item.equals("hamburger"))
            toppings = new Topping[] {new Lettuce(), new Cheese(), new Tomato()};
        else if(item.equals("ham"))
            toppings = new Topping[] {new Cheese(), new Tomato(), new Onion()};
        else if(item.equals("chicken"))
            toppings = new Topping[] {new Lettuce()};
        return toppings;
    }
    
    public Condiment[] createCondiment() {
        Condiment[] condiments = null;
        if(item.equals("hamburger"))
            condiments = new Condiment[] {new Mayonnaise()};
        else if(item.equals("ham"))
            condiments = new Condiment[] {};
        else if(item.equals("chicken"))
            condiments = new Condiment[] {new Mayonnaise()};
        return condiments;
    }
}
