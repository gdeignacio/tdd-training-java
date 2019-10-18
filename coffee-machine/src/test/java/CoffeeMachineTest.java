import java.util.List;
import static org.junit.Assert.*;

import org.junit.Test;
import static org.mockito.ArgumentMatchers.any;
import org.mockito.Mockito;
import static org.mockito.Mockito.when;

public class CoffeeMachineTest {

    //@Test
    //public void think_a_good_name_and_rename_this_method() {
    //    new CoffeeMachine();
    //}

    
    @Test
    public void shouldDelivery() {
        
        DrinkMaker dm = Mockito.mock(DrinkMaker.class);
        //DrinkOrder ins = Mockito.mock(DrinkOrder.class);
        CoffeeMachine cm = new CoffeeMachine(dm);
        
        //Mockito.when(ins.toString()).thenReturn("T:1:0");
        
        cm.delivery();
        
        Mockito.verify(dm).execute(any());
        
    }
    /*
    @Test
    public void shouldOrderSomeDrink() {
        
        DrinkMaker dm = Mockito.mock(DrinkMaker.class);
        DrinkOrder ins = new DrinkOrder();
        CoffeeMachine cm = new CoffeeMachine(dm, ins);
        
        cm.delivery();
        
        
        
    }*/
    
    @Test
    public void shouldOrderTeaOneSugarOneStick() {
        
        DrinkMaker dm = Mockito.mock(DrinkMaker.class);
        DrinkOrder ins = new DrinkOrder();
        CoffeeMachine cm = new CoffeeMachine(dm, ins);
        cm.tea();
        assertEquals("T:1:0", ins.toString());
        
    }
    
    @Test
    public void shouldOrderCoffeOneSugarOneStick() {
        
        DrinkMaker dm = Mockito.mock(DrinkMaker.class);
        DrinkOrder ins = new DrinkOrder();
        CoffeeMachine cm = new CoffeeMachine(dm, ins);
        cm.coffee();
        assertEquals("C:1:0", ins.toString());
        
    }
    
    @Test
    public void shouldOrderChocolateOneSugarOneStick() {
        
        DrinkMaker dm = Mockito.mock(DrinkMaker.class);
        DrinkOrder ins = new DrinkOrder();
        CoffeeMachine cm = new CoffeeMachine(dm, ins);
        cm.hotChocolate();
        assertEquals("H:1:0", ins.toString());
        
    }

    /*
    @Test
    public void shouldOrderMoreSugar() {
        
        DrinkMaker dm = Mockito.mock(DrinkMaker.class);
        DrinkOrder ins = Mockito.mock(DrinkOrder.class);
        CoffeeMachine cm = new CoffeeMachine(dm, ins);
        Mockito.when(ins.toString()).thenReturn("T:1:0");
        
        cm.moreSugar();
        
        Mockito.verify(dm).execute(ins.toString());
        
        
        
        DrinkMaker dm = Mockito.mock(DrinkMaker.class);
        DrinkOrder ins = new DrinkOrder();
        CoffeeMachine cm = new CoffeeMachine(dm, ins);
        cm.hotChocolate();
        assertEquals("H:1:0", ins.toString());
        
    }*/
    
 
    
    
    
    

}
