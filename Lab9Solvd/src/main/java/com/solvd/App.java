package com.solvd;

import java.util.SortedMap;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );


        for (Consoles consoles : Consoles.values()) {

            System.out.println("Name of Console: " + consoles.getName() + " " + consoles.getModel()
                    + " Power Usage: " + consoles.getPowerConsumption());
        }

        System.out.println("-------------------------------------------------------");
        System.out.println("-------------------------------------------------------");
        System.out.println("-------------------------------------------------------");

        for(Color color : Color.values())
        {
            System.out.println("Color of Console: " + color.getName() + " " + color.getConsoles());
        }

        ISubstract<PowerConsumption> funcSubPower = (x, y) -> x.getPower() - y.getPower();
        IMessage<Console> funcPrintConsoleModel = (x) -> x.getYearOFProduction();
        IComp<Consoles>   funcCompConsoles = (x,y) -> (x.getYearOFProduction() > y.getYearOFProduction());;


        System.out.println(funcSubPower.sub(PowerConsumption.MAX_CONSUMPTION,PowerConsumption.MID_CONSUMPTION));
        System.out.println("Your console is from: " + funcPrintConsoleModel.message(new Console(2024)) + " year");
        System.out.println(funcCompConsoles.comp(Consoles.PLAYSTATION,Consoles.NINTENDO));

    }


}
