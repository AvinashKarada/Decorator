package decoratorpattern.starbuzz.Drink.decorators;

import decoratorpattern.starbuzz.Drink.DrinkType;

public class MochaType extends BeverageDecoratorType {
    //Here we create moch type drink which inherite from BeverageDecoratorType class
    String details;
    double ChargesType;
    
    public MochaType(DrinkType Drink) {
        super.Drink = Drink;
        this.details = ", Mocha Drink";
        this.ChargesType = 0.20;
    }

    
    
    @Override
    public String getdetails() {//Get the getails
        return super.getdetails() + details;
    }

    
    
    @Override
    public double getChargesTypes() {//get the charges type
        return super.getChargesTypes() + ChargesType;
    }

}
