public class Car {
    String brand;
    String model;
    double price;

    public Car(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public void displayCar() {
        System.out.println("--- Car Details ---");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: $" + price);
    }

    public static void main(String[] args) {
        Car myCar = new Car("Mercedes-Benz", "EQS Sedan", 104400.00);
        myCar.displayCar();
    }
}