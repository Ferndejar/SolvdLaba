package Interfaces;

public interface ITransport {

    void transport();

    default void transportStatus(){
        System.out.println("Transport interface");
    }
}
