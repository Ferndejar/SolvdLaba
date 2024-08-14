import java.util.Objects;

public class Bus extends Vehicle{

    protected  int amountOfSeats;


    public Bus(String mark, String model, double price, String license_number, int amountOfWheels, String fuelType, int amountOfSeats) {
        super(mark, model, price, license_number, amountOfWheels, fuelType);
        this.amountOfSeats = amountOfSeats;
    }

    @Override
    public void sound() {
        System.out.println("I'm bus im transporting humans, honk honk!");
    }

    @Override
    public void fuel() {
        System.out.println("Bus of: " + getMark() + " " + getModel() + "is using " + getFuelType());

    }

    public void vehicleInfo(int amountOfSeats) {
        System.out.println("Bus of" + getMark() + " " + getModel() + "can carry about: " + amountOfSeats + " passengers");
    }

    @Override
    public String toString() {
        return "Bus{" +
                "amountOfSeats=" + amountOfSeats +
                ", amountOfWheels=" + amountOfWheels +
                ", fuelType='" + fuelType + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Bus bus = (Bus) o;
        return amountOfSeats == bus.amountOfSeats;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), amountOfSeats);
    }
}
