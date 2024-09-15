package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.lang.reflect.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    private static final Logger LOGGER = LogManager.getLogger(Main.class);

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException{

        Class worker = Worker.class;
        Constructor constructor = worker.getConstructor(String.class,int.class);
        Worker worker1 = (Worker) constructor.newInstance("Gepetto",41);
        LOGGER.info(worker1.getName());

        System.out.println("---------------------------------");


        Method methodToString = worker.getMethod("printName");
        methodToString.invoke(worker1);

        worker1.setName("Jerry");
        worker1.setAge(23);
        methodToString.invoke(worker1);

        System.out.println("---------------------------------");


        Field[] fields = worker.getDeclaredFields();
        for(Field field: fields){
            LOGGER.info(field.getName());
            LOGGER.info(field.getType());
            LOGGER.info(field.getModifiers());
        }

        System.out.println("---------------------------------");


        Method[] methods = worker.getDeclaredMethods();
        for(Method method: methods){
            LOGGER.info(method.getName());
        }

        System.out.println("---------------------------------");

        Constructor[] constructors = worker.getConstructors();
        for(Constructor constructor1: constructors){
            LOGGER.info(constructor1.getParameterCount());
            Parameter[] parameters = constructor1.getParameters();
            for(Parameter parameter: parameters){
                LOGGER.info(parameter.getName());
                LOGGER.info(parameter.getType());

            }
        }

        System.out.println("---------------------------------");

        List<Console> consoleList = new ArrayList<>();
        consoleList.add(new Console("Playstation", "5 pro"));
        consoleList.add(new Console("Nintendo", "Switch"));
        consoleList.add(new Console("Xbox", "X"));
        consoleList.stream().map(x -> x.getModel()).forEach(y -> LOGGER.info(y));

        System.out.println("---------------------------------");

        List<String> names = consoleList.stream().map(x -> x.getName()).collect(Collectors.toList());
        LOGGER.info("our products : " + names);

        System.out.println("---------------------------------");

        List<Worker> workerList = new ArrayList<>();
        workerList.add(new Worker("Jackson", 27,5000));
        workerList.add(new Worker("Mickey", 25,7000));
        workerList.add(new Worker("Oren", 16,1000));
        List<Integer> age =  workerList.stream().filter(x -> x.getAge() > 18).map(x -> x.getAge()).collect(Collectors.toList());
        LOGGER.info(age);

        System.out.println("---------------------------------");

        workerList.stream().filter(x -> x.getAge() < 27).filter(x->x.getSalary() > 1000).forEach(x -> LOGGER.info(x.getName()));

        System.out.println("---------------------------------");
        workerList.stream().map(x -> x.getName()).forEach(x->LOGGER.info(x));

        System.out.println("---------------------------------");

        int sumOfAges = workerList.stream().map(x -> x.getAge()).reduce(0, (x,y) -> x+y);
        LOGGER.info(sumOfAges);

        System.out.println("---------------------------------");

        ArrayList<String> list = new ArrayList<>();
        list.add("Audi");
        list.add("Sennhaiser");
        list.add("Automoto");
        list.add("Ferrari");
        list.add("Ages of Empire");
        list.stream().filter(x -> x.startsWith("A")).forEach(y -> LOGGER.info(y));




    }
}