public class EmmausDeli extends SchaperDeli {
    
    protected Sandwich createSandwich(String item) {
        Sanchwich sandwich = null;
        SandwichIngredientFactory ingredientFactory =
        new EmmausSandwichIngredientFactory();
        
        if (item.equals("hamburger")) {
            
            sandwich = new HamburgerSandwich(ingredientFactory);
            sandwich.setName("Emmaus Style Hamburger");
            
        } else if (item.equals("ham")) {
            
            sandwich = new HamSandwich(ingredientFactory);
            sandwich.setName("Emmaus Style Ham Sandwich");
            
        } else if (item.equals("chicken")) {
            
            sandwich = new ChickenSandwich(ingredientFactory);
            sandwich.setName("Emmaus Style Chicken Sandwich");
            
        }
        return sandwich;
    }
}
