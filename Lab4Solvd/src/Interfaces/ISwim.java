package Interfaces;

public interface ISwim {

    void swim();

    default void swimStatus(){
        System.out.println("Swim interface");
    }
}
