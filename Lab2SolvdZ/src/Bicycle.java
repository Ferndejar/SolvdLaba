import java.util.Objects;

public class Bicycle extends Vehicle{

    protected boolean isElectrical;


    public Bicycle(String mark, String model, double price, String license_number, int amountOfWheels, boolean isElectrical) {
        super(mark, model, price, license_number, amountOfWheels);
        this.isElectrical = isElectrical;
    }

    @Override
    public void sound() {
        System.out.println("Bike is making sound of shshhshshsh");
    }

    @Override
    public void fuel() {
        if(isElectrical)
        {
            System.out.println("Bicycle of: " + getMark() + " " + getModel() + " is powered by eletrical battery");
        }
        else
        {
            System.out.println("Bicycle of: " + getMark() + " " + getModel() + " is powered by legs of user");
        }
        }


    public void vehicleInfo(boolean isElectrical, int batteryCapacity) {
        if (isElectrical) {
            System.out.println(getMark() + " " + getModel() + "is" + "has electrical battery and about:" + batteryCapacity + " KWH capacity");
        }
        else
        {
            System.out.println(getMark() + " " + getModel() + "is normal bicycle without any electricity");
        }
    }

    @Override
    public String toString() {
        return "Bicycle{" +
                "isElectrical=" + isElectrical +
                ", amountOfWheels=" + amountOfWheels +
                ", fuelType='" + fuelType + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Bicycle bicycle = (Bicycle) o;
        return isElectrical == bicycle.isElectrical;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), isElectrical);
    }
}
