public class Rental {


     private int numberDaysOfRental;

     private double ratePerDay;

     public Rental(int numberDaysOfRental, double ratePerDay) {
          this.numberDaysOfRental = numberDaysOfRental;
          this.ratePerDay = ratePerDay;
     }

     public int getNumberDaysOfRental() {
          return numberDaysOfRental;
     }

     public double getRatePerDay() {
          return ratePerDay;
     }

     public void setNumberDaysOfRental(int numberDaysOfRental) {
          this.numberDaysOfRental = numberDaysOfRental;
     }

     public void setRatePerDay(double ratePerDay) {
          this.ratePerDay = ratePerDay;
     }

     public double price()
     {
          return numberDaysOfRental * ratePerDay;
     }

     public String print()
     {
          String result;
          result = "\nRetal Info: "+"Number of Days: "+ numberDaysOfRental +" Rate per day: "+ ratePerDay +" Total: " + price() + "\n";
          return result;
     }
}
