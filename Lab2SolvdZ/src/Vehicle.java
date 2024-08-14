import java.util.Objects;

public abstract class Vehicle {

    private String mark;
    private String model;
    private double price;
    private String license_number;

    protected int amountOfWheels;
    protected String fuelType;

    public  Vehicle(){

    };

    public Vehicle(int amountOfWheels)
    {
        this.amountOfWheels = amountOfWheels;
    }

    public Vehicle(String mark, String model, double price, String license_number, int amountOfWheels, String fuelType) {
        this.mark = mark;
        this.model = model;
        this.price = price;
        this.license_number = license_number;
        this.amountOfWheels = amountOfWheels;
        this.fuelType = fuelType;
    }

    public Vehicle(String mark, String model, double price, String license_number, int amountOfWheels) {
        this.mark = mark;
        this.model = model;
        this.price = price;
        this.license_number = license_number;
        this.amountOfWheels = amountOfWheels;
    }

    public abstract void sound();
    public abstract void fuel();

    public void vehicleInfo() {
        System.out.println(" ");
    }

    public int getAmountOfWheels() {
        return amountOfWheels;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setAmountOfWheels(int amountOfWheels) {
        this.amountOfWheels = amountOfWheels;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public String getMark() {
        return mark;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public String getLicense_number() {
        return license_number;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setLicense_number(String license_number) {
        this.license_number = license_number;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "mark='" + mark + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", license_number='" + license_number + '\'' +
                ", amountOfWheels=" + amountOfWheels +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return Double.compare(price, vehicle.price) == 0 && amountOfWheels == vehicle.amountOfWheels && Objects.equals(mark, vehicle.mark) && Objects.equals(model, vehicle.model) && Objects.equals(license_number, vehicle.license_number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mark, model, price, license_number, amountOfWheels);
    }
}
