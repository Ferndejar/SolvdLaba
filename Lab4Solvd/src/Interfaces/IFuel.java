package Interfaces;

public interface IFuel {

    void fuel();

    default void fuelStatus(){
        System.out.println("Fuel interface");
    }
}
