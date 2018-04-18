public class AllentownDeli extends SchaperDeli {
    
    protected Sandwich createSandwich(String item) {
        Sandwich sandwich = null;
        SandwichIngredientFactory ingredientFactory =
        new AllentownSandwichIngredientFactory();
        
        if (item.equals("hamburger")) {
            
            sandwich = new HamburgerSandwich(ingredientFactory);
            sandwich.setName("Allentown Style Hamburger");
            
        } else if (item.equals("ham")) {
            
            sandwich = new HamSandwich(ingredientFactory);
            sandwich.setName("Allentown Style Ham Sandwich");
            
        } else if (item.equals("chicken")) {
            
            sandwich = new ChickenSandwich(ingredientFactory);
            sandwich.setName("Allentown Style Chicken Sandwich");
            
        }
        return sandwich;
    }
}
