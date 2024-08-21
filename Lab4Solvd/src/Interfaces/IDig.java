package Interfaces;

public interface IDig {

    void dig();

    default void digStatus(){
        System.out.println("Dig interface");
    }

}
