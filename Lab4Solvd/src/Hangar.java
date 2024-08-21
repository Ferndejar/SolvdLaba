public final class Hangar {


    static {
        System.out.println("Static Hangar block");
    }

    private final int totalVehicles  = 5;
    private static String hangarName = "Hangar";

    public final void printInfo(){
        System.out.println("In Hangar there are " + totalVehicles + " amount of vehicles");
    }

    public static void checkName(){
        System.out.println("Hangar name is: " + hangarName);
    }


}
