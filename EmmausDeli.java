public class EmmausDeli extends SchaperDeli {
    
    protected Sandwich createSandwich(String item) {
        Sandwich sandwich = null;
        SandwichIngredientFactory ingredientFactory =
        new EmmausSandwichIngredientFactory(item);
        
        if (item.equals("hamburger")) {
            
            sandwich = new EmmausHamburger(ingredientFactory);
            sandwich.setName("Emmaus Style Hamburger");
            
        } else if (item.equals("ham")) {
            
            sandwich = new EmmausHamSandwich(ingredientFactory);
            sandwich.setName("Emmaus Style Ham Sandwich");
            
        } else if (item.equals("chicken")) {
            
            sandwich = new EmmausChickenSandwich(ingredientFactory);
            sandwich.setName("Emmaus Style Chicken Sandwich");
            
        }
        return sandwich;
    }
}
