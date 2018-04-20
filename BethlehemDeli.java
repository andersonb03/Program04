public class BethlehemDeli extends SchaperDeli {
    
    protected Sandwich createSandwich(String item) {
        Sandwich sandwich = null;
        SandwichIngredientFactory ingredientFactory =
        new BethlehemSandwichIngredientFactory(item);
        
        if (item.equals("hamburger")) {
            
            sandwich = new BethlehemHamburger(ingredientFactory);
            sandwich.setName("Bethlehem Style Hamburger");
            
        } else if (item.equals("ham")) {
            
            sandwich = new BethlehemHamSandwich(ingredientFactory);
            sandwich.setName("Bethlehem Style Ham Sandwich");
            
        } else if (item.equals("chicken")) {
            
            sandwich = new BethlehemChickenSandwich(ingredientFactory);
            sandwich.setName("Bethlehem Style Chicken Sandwich");
            
        } else if (item.equals("andersonspecial")) {
            
            sandwich = new BethlehemAndersonSpecial(ingredientFactory);
            sandwich.setName("Bethlehem Style Anderson Special");

        } else if (item.equals("fauxspecial")) {
            
            sandwich = new BethlehemFauxSpecial(ingredientFactory);
            sandwich.setName("Bethlehem Style Faux Special");
            
        } else if (item.equals("mccoolspecial")) {
            
            sandwich = new BethlehemMcCoolSpecial(ingredientFactory);
            sandwich.setName("Bethlehem Style McCool Special");
        }
        return sandwich;
    }
}
