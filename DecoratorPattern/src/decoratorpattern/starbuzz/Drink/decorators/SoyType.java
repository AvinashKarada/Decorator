package decoratorpattern.starbuzz.Drink.decorators;

import decoratorpattern.starbuzz.Drink.DrinkType;

public class SoyType extends BeverageDecoratorType {
//Here we create SoyType drink which inherite from BeverageDecoratorType class
    String details;
    double ChargesType;

    
    
    public SoyType(DrinkType Drink) {
        super.Drink = Drink;
        this.details = ", Soy drink";
        this.ChargesType = 0.15;
    }

    
    
    @Override
    public String getdetails() {//Get the getails
        return super.getdetails() + details;
    }

    
    
    @Override
    public double getChargesTypes() {//get the charges
        return super.getChargesTypes() + ChargesType;
    }

}
