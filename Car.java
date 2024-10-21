public class Car
{
    //carName, milesDriven, and gallonsUsed
    private String carName;
    private double milesDriven;
    private double gallonsUsed;
    
    public Car() {
        carName = "";
        milesDriven = 0;
        gallonsUsed = 0;
    }


    public Car(String carName, double milesDriven,double gallonsUsed )
    {
        carName = carName;
        milesDriven = milesDriven;
        gallonsUsed = gallonsUsed;
        
    }
    public void setCarName(String carName){
        this.carName = carName;
    }
    public String getCarName(){
        return carName;
    }
    public void setMilesDriven(double milesDriven){
        this.milesDriven = milesDriven;
    }
    public double getMilesDriven() {
        return milesDriven;
    }
    public void setGallonsUsed(double gallonsUsed){
        this.gallonsUsed = gallonsUsed;
    }
    public double getGallonsUsed() {
        return gallonsUsed;
    }
    public double calculateAverage(){
        double milesDriven = getMilesDriven();
        double gallonsUsed = getGallonsUsed();
        
        double averageMiles= Math.round((milesDriven / gallonsUsed) * 10.0)/10.0;
        return averageMiles;
    }
    public String toString() {
       return " Car Nmae " + carName +
              ", Miles Driven " + milesDriven +
              ", Gallons Used " + gallonsUsed;       
       
    }
}


