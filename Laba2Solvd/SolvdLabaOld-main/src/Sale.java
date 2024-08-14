public class Sale {

    private double depreciation;
    private double sellPrice;
    private double rate;

    private Vehicle vehicle;

    public Sale(Vehicle vehicle, double depreciation, double sellPrice) {
        this.sellPrice = sellPrice;
        this.vehicle = vehicle;
        this.depreciation = depreciation;
    }

    public double getDepreciation() {
        return depreciation;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public double getRate() {
        return rate;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setDepreciation(double rate) {
        this.depreciation = (rate/100)* vehicle.getPrice();
    }

    public void setSellPrice(double sell_price) {
        this.sellPrice = vehicle.getPrice() - depreciation;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }


    public String print()
    {
        return (vehicle.print() + "Depreciation "+ getDepreciation() + " " + "  Selling Price: "+ " " + getSellPrice() + "\n");
    }


}
