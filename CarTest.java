public class CarTest {
    public static void main(String[]args){
        ElectricCar neta=new ElectricCar("Neta Model");
        ElectricCar tesla=new ElectricCar("Tesla Model");

        neta.showBrand();
        neta.startEngine();
        neta.fuelType();

        tesla.showBrand();
        tesla.startEngine();
        tesla.fuelType();


    }
}
