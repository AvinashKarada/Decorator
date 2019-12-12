package starbuzz;

import decoratorpattern.starbuzz.Drink.DrinkType;
import decoratorpattern.starbuzz.Drink.DarkRoastType;
import decoratorpattern.starbuzz.Drink.EspressoType;
import decoratorpattern.starbuzz.Drink.HouseBlendType;
import decoratorpattern.starbuzz.Drink.decorators.MochaType;
import decoratorpattern.starbuzz.Drink.decorators.SkimType;
import decoratorpattern.starbuzz.Drink.decorators.SoyType;
import decoratorpattern.starbuzz.Drink.decorators.WhipType;

public class Main {

    
    
    public static void main(String[] args) {
        
        DrinkType DrinkType1 = new HouseBlendType();//Create houseblend
        DrinkType1 = new SoyType(DrinkType1);//Create SoyType
        DrinkType1 = new MochaType(DrinkType1);//Create MochaType
        DrinkType1 = new WhipType(DrinkType1);//Create WhipType
        
        DrinkType DrinkType2 = new DarkRoastType();//Create DarkRoastType
        DrinkType2 = new MochaType(DrinkType2);//Create MochaType
        DrinkType2 = new MochaType(DrinkType2);//Create DarkRoastType
        DrinkType2 = new WhipType(DrinkType2);//Create WhipType
        
        DrinkType DrinkType3 = new EspressoType();//Create EspressoType
        DrinkType3 = new SkimType(DrinkType3);//Create SkimType
        
        //Display result
        System.out.println( DrinkType1.getdetails() + " " + String.format("%6.2f", DrinkType1.getChargesTypes()));
        System.out.println( DrinkType2.getdetails() + " " + String.format("%6.2f", DrinkType2.getChargesTypes()));
        System.out.println( DrinkType3.getdetails() + " " + String.format("%6.2f", DrinkType3.getChargesTypes()));

    }

}
