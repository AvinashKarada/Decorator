package decoratorpattern.starbuzz.Drink.decorators;

import decoratorpattern.starbuzz.Drink.DrinkType;

public class WhipType extends BeverageDecoratorType {
//Here we create WhipType drink which inherite from BeverageDecoratorType class
    String details;
    double ChargesType;

    
    
    public WhipType(DrinkType Drink) {
        this.Drink = Drink;
        this.details = ", Whip drink";
        this.ChargesType = 0.30;
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
