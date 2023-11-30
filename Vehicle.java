class Vehicle {
    protected String brand = "Ford";

    public void honk() {
        System.out.println("FUCK OFF U FAGS!");
    }
}

class Car extends Vehicle {
    private String modelName = "Mustang";

    public static void main(String[] args) {
        Car myFastCar = new Car();
        myFastCar.honk();
        System.out.println("Kiss ma " + myFastCar.brand + " " + myFastCar.modelName);
    }
}
