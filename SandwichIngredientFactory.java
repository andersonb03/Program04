public interface SandwichIngredientFactory {
    
    public Bread createBread();
    public Topping[] createTopping();
    public Condiment[] createCondiment();
    
}
