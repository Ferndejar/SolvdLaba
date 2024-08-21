import Interfaces.IFly;
import Interfaces.IFuel;
import Interfaces.ITransport;

public class Airplane extends Vehicle implements IFly, IFuel, ITransport {
    @Override
    public void fly() {
        System.out.println("Airplane is flying");
    }

    @Override
    public void fuel() {
        System.out.println("Airplane is being fueled");
    }

    @Override
    public void transport() {
        System.out.println("Airplane is transporting people/items");
    }

    @Override
    public void repair() {
        System.out.println("Airplane has been repaired");
    }
}
