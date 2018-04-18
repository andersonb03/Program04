public class Main {
    
    public static void main(String args[]){
        SchaperDeli aDeli = new AllentownDeli();
        SchaperDeli bDeli = new BethlehemDeli();
        SchaperDeli eDeli = new EmmausDeli();
        
        //Allentown sandwiches
        Sandwich sandwich1 = aDeli.orderSandwich("hamburger");
        Sandwich sandwich2 = aDeli.orderSandwich("ham");
        Sandwich sandwich3 = aDeli.orderSandwich("chicken");

        //Bethlehem sandwiches
        Sandwich sandwich4 = bDeli.orderSandwich("hamburger");
        Sandwich sandwich5 = bDeli.orderSandwich("ham");
        Sandwich sandwich6 = bDeli.orderSandwich("chicken");

        //Emmaus sandwiches
        Sandwich sandwich7 = eDeli.orderSandwich("hamburger");
        Sandwich sandwich8 = eDeli.orderSandwich("ham");
        Sandwich sandwich9 = eDeli.orderSandwich("chicken");

        System.out.println("Dr. Schaper ordered a " + sandwich1 + ", " + sandwich2 + ", " + sandwich3 + ", " + sandwich4 + ", " + sandwich5 + ", " + sandwich6 + ", " + sandwich7 + ", " + sandwich8 + ", " + sandwich9);
    }
}
