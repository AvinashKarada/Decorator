package decoratorpattern.starbuzz.Drink;

public class EspressoType extends DrinkType {
    
    double ChargesType;

    public EspressoType() {
        details = "Espresso drink";
        ChargesType = 3.50;
    }

    
    
    @Override
    public double getChargesTypes() {//get the charges
        return ChargesType;
    }

}
