public class Part {

    private String name;

    private String type;
    private double price;

    public Part(){};

    public Part(String name, String type, double price) {
        this.name = name;
        this.type = type;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void print()
    {
        System.out.print("Name of Part: " + getName() + "," + " type of Part: " + getType() + "," + " price: " + getPrice()+"\n");
    }


}
