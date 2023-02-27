package md.tekwill.homework.lesson6;

import md.tekwill.homework.lesson6.encapsualtion.BankAccount;
import md.tekwill.homework.lesson6.inheritance.SideCarMotorcycle;
import md.tekwill.homework.lesson6.inheritance.Vehicle;

public class Main {

    public static void main(String[] args){
        BankAccount myAccount = new BankAccount();
        myAccount.setAccountNumber("87LA58167809B5");
        myAccount.setBalance(50.86f);
        myAccount.setOwnerName("Anna");


        System.out.println("Account information: \n" + myAccount.getAccountNumber());
        System.out.println(myAccount.getBalance());
        System.out.println(myAccount.getOwnerName());

        BankAccount jointAccount = new BankAccount();
        jointAccount.setAccountNumber("87LA12345987A4");
        jointAccount.setBalance(12500.78f);
        jointAccount.setOwnerName("Mircea & Anna");

        System.out.println("Joint account information: \n" + jointAccount.getAccountNumber());
        System.out.println(jointAccount.getBalance());
        System.out.println(jointAccount.getOwnerName());

        Vehicle myVehicle = new Vehicle();
        myVehicle.setColor("Magenta");
        myVehicle.setNumberOfWheels(4);
        myVehicle.showVehicleDetails();

        //System.out.println("Showing Vehicle Details: " + myVehicle.getColor() + " " + myVehicle.getNumberOfWheels());

        SideCarMotorcycle grandfatherMotorcycle = new SideCarMotorcycle();
        grandfatherMotorcycle.setBrand("Ural");
        //grandfatherMotorcycle.brand = "IJ"; doar daca modificatorul de acces e diferit de private
        grandfatherMotorcycle.setNumberOfWheels(3);
        grandfatherMotorcycle.setColor("Jungle Green");
        grandfatherMotorcycle.showVehicleDetails();

        Vehicle myBike = new SideCarMotorcycle();
        myBike.setNumberOfWheels(2);
        myBike.setColor("black");
        myBike.showVehicleDetails();
    }



}
