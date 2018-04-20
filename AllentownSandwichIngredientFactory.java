public class AllentownSandwichIngredientFactory implements SandwichIngredientFactory {
    String item;

    public AllentownSandwichIngredientFactory(String item){
        this.item = item;
    }
    
    public Bread createBread() {
        return new Bun();
    }
    
    public Topping[] createTopping() {

        Topping[] topping = null;
        //Topping toppings[] = { new Sprouts(), new Lettuce(), new Cheese(), new Tomato(), new Onion() };

        if(item.equals("hamburger"))
            topping = new Topping[] {new Lettuce(), new Cheese(), new Tomato()};
        else if(item.equals("ham"))
            topping = new Topping[] {new Cheese(), new Tomato(), new Onion()};
        else if(item.equals("chicken"))
            topping = new Topping[] {new Lettuce()};
        return topping;
    }
    
    public Condiment[] createCondiment() {
        Condiment[] condiment = null;
        if(item.equals("hamburger"))
            condiment = new Condiment[] {new Mayonnaise()};
        else if(item.equals("ham"))
            condiment = new Condiment[] {};
        else if(item.equals("chicken"))
            condiment = new Condiment[] {new Mayonnaise()};
        return condiment;
    }
}
