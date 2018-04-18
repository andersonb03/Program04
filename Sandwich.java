public abstract class Sandwich {
    String name;
    
    Bread bread;
    Topping toppings[];
    Condiment condiments[];
    
    abstract void makeSandwich();
    
    void setName(String name) {
        this.name = name;
    }
    
    String getName() {
        return name;
    }
    
    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("---- " + name + " ----\n");
        if (bread != null) {
            result.append(bread);
            result.append("\n");
        }
        if (toppings != null) {
            for (int i = 0; i < toppings.length; i++) {
                result.append(toppings[i]);
                if (i < toppings.length-1) {
                    result.append(", ");
                }
            }
        }
        if (condiments != null) {
            for (int i = 0; i < condiments.length; i++) {
                result.append(condiments[i]);
                if (i < condiments.length-1) {
                    result.append(", ");
                }
            }
            result.append("\n");
        }
        return result.toString();
    }
}
