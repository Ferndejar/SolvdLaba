public class Worker {

    private String firstName;
    private String lastName;

    private Part part;

    public Worker(){};

    public Worker(String firstName, String lastName, Part part) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.part = part;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public void repair(Vehicle vehicle)
    {
        System.out.println(firstName +" " + lastName + " repairs: " +vehicle.getMark() + " " + vehicle.getModel()+"\n");
    }
}
