package decoratorpattern.starbuzz.Drink.decorators;

import decoratorpattern.starbuzz.Drink.DrinkType;

public class SkimType extends BeverageDecoratorType {
 //Here we create SkimType drink which inherite from BeverageDecoratorType class
    String details;
    double ChargesType;


    
    public SkimType(DrinkType Drink) {
        this.Drink = Drink;
        this.details = ", Skim drink";
        this.ChargesType = 0.10;
    }

    
    
    @Override
    public String getdetails() {//Get the getails
        return Drink.getdetails() + details;
    }

    
    
    @Override
    public double getChargesTypes() {//get the charges 
        return Drink.getChargesTypes() + ChargesType;
    }

}
