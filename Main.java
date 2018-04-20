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
        
        //Custom sandwiches
        Sandwich andersonSandwich = bDeli.orderSandwich("andersonspecial");
        Sandwich fauxSandwich = bDeli.orderSandwich("fauxspecial");
        Sandwich mccoolSandwich = bDeli.orderSandwich("mccoolspecial");
        Sandwich nischalSandwich = aDeli.orderSandwich("nischalspecial");

        System.out.println("Dr. Schaper ordered a: \n" + sandwich1 + "$" + sandwich1.getCost() + "\n" + sandwich2 + "$" + sandwich2.getCost() + "\n" + sandwich3 + "$" + sandwich3.getCost() + "\n" + sandwich4 + "$" + sandwich4.getCost() + "\n" + sandwich5 + "$" + sandwich5.getCost() + "\n" + sandwich6 + "$" + sandwich6.getCost() + "\n" + sandwich7 + "$" + sandwich7.getCost() + "\n" + sandwich8 + "$" + sandwich8.getCost() + "\n" + sandwich9 + "$" + sandwich9.getCost() + "\n" + andersonSandwich + "$" + andersonSandwich.getCost() + "\n" + fauxSandwich + "$" + fauxSandwich.getCost()+"\n" + mccoolSandwich + "$" + mccoolSandwich.getCost() + "\n" + nischalSandwich + "$" + nischalSandwich.getCost());}
}
