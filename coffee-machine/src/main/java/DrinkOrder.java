/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gdeignacio
 */
public class DrinkOrder {
    
    int drinkType;
    int sugarAmount;
    boolean stick;
    
    DrinkOrder(){
        this.sugarAmount = 1;
        this.stick =  false;
    }

    public int getDrinkType() {
        return drinkType;
    }

    public void setDrinkType(int drinkType) {
        this.drinkType = drinkType;
    }

    public int getSugarAmount() {
        return sugarAmount;
    }

    public void setSugarAmount(int sugarAmount) {
        this.sugarAmount = sugarAmount;
    }

    public boolean isStick() {
        return stick;
    }

    public void setStick(boolean stick) {
        this.stick = stick;
    }

    @Override
    public String toString() {
        return "Instruction{" + "drinkType=" + drinkType + ", sugarAmount=" + sugarAmount + ", stick=" + stick + '}';
    }
    
    

    

    
    
}
