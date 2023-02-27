package md.tekwill.homework.lesson6.inheritance;

public class SideCarMotorcycle extends Vehicle {

  private String brand;

  public void setBrand(String brand){
      this.brand = brand;
    }
    public String getBrand(){
      return this.brand;
    }

  public void showVehicleDetails(){
    System.out.println("Showing Motorcycle Details: \n" + getColor() + "\n" + getNumberOfWheels() + "\n" + brand);
  }
}
