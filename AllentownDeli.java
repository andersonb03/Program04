public class AllentownDeli extends SchaperDeli {
    
    protected Sandwich createSandwich(String item) {
        Sandwich sandwich = null;
        SandwichIngredientFactory ingredientFactory =
        new AllentownSandwichIngredientFactory(item);
        
        if (item.equals("hamburger")) {
            
            sandwich = new AllentownHamburger(ingredientFactory);
            sandwich.setName("Allentown Style Hamburger");
            
        } else if (item.equals("ham")) {
            
            sandwich = new AllentownHamSandwich(ingredientFactory);
            sandwich.setName("Allentown Style Ham Sandwich");
            
        } else if (item.equals("chicken")) {
            
            sandwich = new AllentownChickenSandwich(ingredientFactory);
            sandwich.setName("Allentown Style Chicken Sandwich");
            
        }
        return sandwich;
    }
}
