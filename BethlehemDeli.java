public class BethlehemDeli extends SchaperDeli {
    
    protected Sandwich createSandwich(String item) {
        Sanchwich sandwich = null;
        SandwichIngredientFactory ingredientFactory =
        new BethlehemSandwichIngredientFactory();
        
        if (item.equals("hamburger")) {
            
            sandwich = new HamburgerSandwich(ingredientFactory);
            sandwich.setName("Bethlehem Style Hamburger");
            
        } else if (item.equals("ham")) {
            
            sandwich = new HamSandwich(ingredientFactory);
            sandwich.setName("Bethlehem Style Ham Sandwich");
            
        } else if (item.equals("chicken")) {
            
            sandwich = new ChickenSandwich(ingredientFactory);
            sandwich.setName("Bethlehem Style Chicken Sandwich");
            
        }
        return sandwich;
    }
}
