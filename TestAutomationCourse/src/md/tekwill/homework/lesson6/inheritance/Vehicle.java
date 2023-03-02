package md.tekwill.homework.lesson6.inheritance;

public class Vehicle {

    private String color;
    private int numberOfWheels;

    public Vehicle(){

    }

    public Vehicle(String color, int numberOfWheels){
        this.color = color;
        this.numberOfWheels = numberOfWheels;
    }

    public void setColor(String color){
       this.color = color;
    }

    public String getColor(){
      return this.color;
    }

    public void setNumberOfWheels(int numberOfWheels){
       this.numberOfWheels = numberOfWheels;
    }

    public int getNumberOfWheels(){
        return this.numberOfWheels;
    }

   public void showVehicleDetails(){
        System.out.println("Showing Vehicle Details: \n" + color + "\n" + numberOfWheels);
   }
}
