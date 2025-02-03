//The abstract class allows subclasses of the class to inherit common features for all the cars in this instance
abstract class Car implements Vehicle {
    protected String brand;//This is the common property for all the cars and therefore inherited by subclasses

    public Car(String brand){
        this.brand=brand;
    }//Creating the constructor that will be useful in the brand

    abstract void fuelType();
    //For each subclass of Car,there should be a stated type of fuel that the car specified in the subclass uses

    public void showBrand() {
        System.out.println("Car Brand: " + brand);
    }



}
