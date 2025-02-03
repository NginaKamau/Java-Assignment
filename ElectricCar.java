//In the concrete class, all abstract methods from the parent class are inherited and one can specify the behavior of the class here
//Since the abstract class cannot be instantiated, a concrete class is created so as to create objects
class ElectricCar extends Car {

    public ElectricCar(String brand){
        super(brand);//This method calls the constructor that was creates in the abstract class Car
    }

    @Override//This is used to implement the method found in the abstract method
    void fuelType() {
        System.out.println(brand + "runs on electricity");
    }
    @Override//This is used to implement the method found in the Interface
    public void startEngine(){
        System.out.println(brand+"starts silently");


    }

}
