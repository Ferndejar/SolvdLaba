public class Vehicle {

    private String mark;
    private String model;
    private double price;
    private String license_number;

    private int amountOfWheels;

    public  Vehicle(){

    };

    public Vehicle(int amountOfWheels)
    {
        this.amountOfWheels = amountOfWheels;
    }

    public Vehicle(String mark, String model, double price, String license_number) {
        this.mark = mark;
        this.model = model;
        this.price = price;
        this.license_number = license_number;
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

    public String print()
    {
        String result;
        result = "License # : "+ getLicense_number()+ " Vehicle Name : "+ getMark() + " " + getModel() + " Price : "+ getPrice() +"\n";
        return result;
    }
}
