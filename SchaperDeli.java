public abstract class SchaperDeli {
    
    protected abstract Sandwich createSandwich(String item);
    
    public Sandwich orderSandwich(String type) {
        Sandwich sandwich = createSandwich(type);
        System.out.println("--- Making a " + sandwich.getName() + " ---");
	 sandwich.makeSandwich();
        return sandwich;
    }


}
