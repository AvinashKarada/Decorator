package decoratorpattern.starbuzz.Drink;

public abstract class DrinkType {
    
    String details = "Unknown drink";

    
    
    public String getdetails() {
        return details;
    }
    
    
    
    public abstract double getChargesTypes();//get the charges

}
