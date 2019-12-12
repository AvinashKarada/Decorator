package decoratorpattern.starbuzz.Drink;

public class DarkRoastType extends DrinkType {

     //It is decorator class which is commaon to all classes and create the decorate types like expreso,Houseblend
    public DarkRoastType() {
        details = "DarkRoast drink";
    }
    

    
    @Override
    public double getChargesTypes() {//get the charges
        return 3.00f;
    }

}
