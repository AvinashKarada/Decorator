package decoratorpattern.starbuzz.Drink;

public class HouseBlendType extends DrinkType {
    
    public HouseBlendType() {
        details = "HouseBlend drink";
    }


    
    @Override
    public double getChargesTypes() {//get the charges
        return 2.50;
    }

}
