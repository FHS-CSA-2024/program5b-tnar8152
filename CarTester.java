import java.util.Scanner;
public class CarTester
{
    
    public Car addCar(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter the cars name; ");
        String carName = scanner.nextLine();
        System.out.println("please enter the car miles:");
        double milesDriven = scanner.nextDouble();
        System.out.println("Please enter cars gallons: ");
        double gallonsUsed = scanner.nextDouble();
        Car car = new Car(carName, milesDriven ,gallonsUsed);
        car.setCarName (carName);
        car.setMilesDriven(milesDriven);
        car.setGallonsUsed(gallonsUsed);
        return car;    
        
    }
    public static void main (String [] args){
        CarTester carTester = new CarTester();
        Car hondaCar = carTester.addCar();
        double averageValue = hondaCar.calculateAverage();
        System.out.println(hondaCar.getCarName() + " averaged = " + averageValue + " m/g");
        Car toadMobile = carTester.addCar();
        double averageValue1 = toadMobile.calculateAverage();
        System.out.println(toadMobile.getCarName() + " averaged = " + averageValue1 + " m/g");
        
    }
}

