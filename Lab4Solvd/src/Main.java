import Interfaces.*;

public class Main {
    public static void main(String[] args) {

        Vehicle boat = new Boat();
        boat.repair();
        boat.turnOff();

        ISwim boat2 = new Boat();
        boat2.swim();
        boat2.swimStatus();

        ITransport boat3 = new Boat();
        boat3.transport();
        boat3.transportStatus();

        IFuel boat4 = new Boat();
        boat4.fuel();
        boat4.fuelStatus();

        IFly airplane = new Airplane();
        airplane.fly();
        airplane.flyStatus();

        IDig excavator = new Excavator();
        excavator.dig();
        excavator.digStatus();

        Excavator excavator1 = new Excavator();
        excavator1.dig();
        excavator1.fuel();
        excavator1.repair();
        excavator1.turnOff();
        excavator1.digStatus();

        Hangar.checkName();
        Hangar hangar = new Hangar();
        hangar.printInfo();

    }
}