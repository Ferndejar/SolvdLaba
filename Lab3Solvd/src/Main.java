public class Main {
    public static void main(String[] args) {

        Vehicle veh = new Car("Volskwagen","golf",24000,"EKL563126FG8", 4, "diesel");

        veh.sound();
        veh.fuel();
        String print = veh.toString();
        System.out.println(print);

        

        Vehicle veh2 = new Bus("Mercedes","Sprinter",45300,"XAS234721FVC",5,"gasoline",19);
        veh2.sound();
        veh2.fuel();
        print = veh2.toString();
        System.out.println(print);
        
        Vehicle veh3 = new Bicycle("Romet","Lanca",1400,"",2,true);
        veh3.sound();
        veh3.fuel();
        print = veh3.toString();
        System.out.println(print);


        System.out.println(veh.getMark().equals(veh2.getMark()));
        System.out.println(veh2.getFuelType().equals(veh.getFuelType()));
        System.out.println(veh3.getModel().equals(veh.getModel()));


        System.out.println(veh.getMark().hashCode());
        System.out.println(veh2.getFuelType().hashCode());

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