import java.util.*;

public class EmmausHamSandwich extends Sandwich {
    List<IngredientType> ingredient;

    public void EmmausHamSandwich(IngredientType ingredient){
        this.ingredient = ingredient;
    }
    
    public void makeSandwich(Sandwich s){
        switch(ingredient){
            case BUN:
                s.addIngredient(BUN);
                break;
            case CHEESE:
                s.addIngredient(CHEESE);
                break;
            case MUSTARD:
                s.addIngredient(MUSTARD);
                break;
        }
    }
}
