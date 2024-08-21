import Interfaces.IDig;
import Interfaces.IFuel;
import Interfaces.ISwim;
import Interfaces.ITransport;

public class Boat extends Vehicle implements ISwim, IFuel, ITransport {

    @Override
    public void fuel() {
        System.out.println("Boat has been fueled");
    }

    @Override
    public void swim() {
        System.out.println("Boat is swimming");
    }

    @Override
    public void transport() {
        System.out.println("Boat is transporting people/items");
    }

    @Override
    public void repair() {
        System.out.println("Boat has been repaired");
    }
}
