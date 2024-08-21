import Interfaces.IDig;
import Interfaces.IFuel;
import Interfaces.ITransport;

public class Excavator extends Vehicle implements IDig, IFuel {
    @Override
    public void dig() {
        System.out.println("Excavator is digging");
    }

    @Override
    public void fuel() {
        System.out.println("Excavator has been fueled");
    }

    @Override
    public void repair() {
        System.out.println("Excavator has been repaired");
    }
}
