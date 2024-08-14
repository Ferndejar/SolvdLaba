public class Main {
    public static void main(String[] args) {

        Vehicle veh = new Vehicle("Volskwagen","golf",24000,"EKL563126FG8");

        String print = veh.print();

        System.out.println(print);

        Vehicle veh2 = new Vehicle();
        veh2.setMark("Toyota");
        veh2.setModel("Supra");
        veh2.setPrice(65000);
        veh2.setLicense_number("EKLXSA29FG4");
        print = veh2.print();
        System.out.println(print);

        Worker worker = new Worker();

        worker.setFirstName("Jim");
        worker.setLastName("Anvil");

        worker.repair(veh2);

        Sale sale = new Sale(veh2,350, 80000);
        sale.setDepreciation(0.53847);
        sale.setSellPrice(80000);
        String value = sale.print();
        System.out.println(value);

        Part part = new Part("Engine","V8",8400);
        part.print();

        Rental rental = new Rental(8,120);
        print = rental.print();
        System.out.println(print);

    }
}