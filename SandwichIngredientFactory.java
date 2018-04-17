public interface SandwichIngredientFactory {
    
    public Meat createMeat();
    public Bread createBread();
    public Topping[] createTopping();
    public Condiment[] createCondiment();
    
}
