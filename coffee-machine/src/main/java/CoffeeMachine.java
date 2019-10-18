public class CoffeeMachine {

    public DrinkMaker dm;
    public DrinkOrder drord;
    
    CoffeeMachine(DrinkMaker dm
            //, DrinkOrder ins
       ) {
        this.dm = dm;
    }

    
    /*
    void tea() {
        ins.setDrinkType(DrinkOrder.DrinkType.TEA.ordinal());
    }

    void coffee() {
        ins.setDrinkType(DrinkOrder.DrinkType.COFFEE.ordinal());
    }
    
    void hotChocolate() {
        ins.setDrinkType(DrinkOrder.DrinkType.CHOCOLATE.ordinal());
    }
    */
    
    void delivery() 
            
        DrinkOrder drord = new DrinkOrder();
            
        dm.execute(ins.toString());
    }
   

}
