package Interfaces;

public interface IFly {

    void fly();

    default void flyStatus(){
        System.out.println("Fly interface");
    }

}
