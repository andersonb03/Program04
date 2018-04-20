public abstract class Sandwich {
    String name;

    
    abstract void makeSandwich();
    
    void setName(String name) {
        this.name = name;
    }
    
    String getName() {
        return name;
    }

    public abstract double getCost();


}
