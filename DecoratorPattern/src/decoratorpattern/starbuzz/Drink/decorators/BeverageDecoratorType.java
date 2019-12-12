package decoratorpattern.starbuzz.Drink.decorators;

import decoratorpattern.starbuzz.Drink.DrinkType;

public abstract class BeverageDecoratorType extends DrinkType {
    //It is decorator class which is commaon to all classes and create the decorate type s like mocha,skim
    DrinkType Drink;

    @Override
    public String getdetails() {
        return Drink.getdetails();
    }

    @Override
    public double getChargesTypes() {
        return Drink.getChargesTypes();
    }

}
