import java.util.Objects;

public class Car extends Vehicle{


    protected int maxSpeed;
    protected int horsePower;

    public Car() {
    }

    public Car(String mark, String model, double price, String license_number, int amountOfWheels) {
        super(mark, model, price, license_number, amountOfWheels);
    }

    public Car(String mark, String model, double price, String license_number, int amountOfWheels, String fuelType) {
        super(mark, model, price, license_number, amountOfWheels, fuelType);
    }

    public Car(String mark, String model, double price, String license_number, int amountOfWheels, String fuelType, int maxSpeed , int horsePower) {
        super(mark, model, price, license_number, amountOfWheels, fuelType);
        this.maxSpeed = maxSpeed;
        this.horsePower = horsePower;
    }

    @Override
    public void sound() {
        System.out.println("I am car im doing brrrr vrrr");
    }

    @Override
    public void fuel() {
        System.out.println("Car of: " + getMark() + " " + getModel() + " is using " + getFuelType());
    }

   public void vehicleInfo(int maxSpeed, int horsepower)
   {
       System.out.println(getMark() + " " + getModel() + "has" + maxSpeed +" and about: " + horsepower + " HP" );
   }

    @Override
    public String toString() {
        return "Car{" +
                "maxSpeed=" + maxSpeed +
                ", horsePower=" + horsePower +
                ", amountOfWheels=" + amountOfWheels +
                ", fuelType='" + fuelType + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Car car = (Car) o;
        return maxSpeed == car.maxSpeed && horsePower == car.horsePower;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), maxSpeed, horsePower);
    }
}
