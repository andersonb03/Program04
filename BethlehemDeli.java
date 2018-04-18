public class BethlehemDeli extends SchaperDeli {
    
    protected Sandwich createSandwich(String item) {
        Sandwich sandwich = null;
        SandwichIngredientFactory ingredientFactory =
        new BethlehemSandwichIngredientFactory(item);
        
        if (item.equals("hamburger")) {
            
            sandwich = new BethlehemHamburgerSandwich(ingredientFactory);
            sandwich.setName("Bethlehem Style Hamburger");
            
        } else if (item.equals("ham")) {
            
            sandwich = new BethlehemHamSandwich(ingredientFactory);
            sandwich.setName("Bethlehem Style Ham Sandwich");
            
        } else if (item.equals("chicken")) {
            
            sandwich = new BethlehemChickenSandwich(ingredientFactory);
            sandwich.setName("Bethlehem Style Chicken Sandwich");
            
        }
        return sandwich;
    }
}
