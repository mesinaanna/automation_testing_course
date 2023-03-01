package md.tekwill.homework.lesson7;

public class Main {

    public static void main(String[] args) {
        Persona marinel = new Persona();
        marinel.name = "Andrei";
        marinel.setLastName("Voievodschi");
        marinel.age = 25;
        marinel.setGender("male");
        marinel.setWeight(82.75f);


        System.out.println("Personal information: \n" + marinel.name);
        System.out.println(marinel.getLastName());
        System.out.println(marinel.age);
        System.out.println(marinel.getGender());
        System.out.println(marinel.getWeight());

    }
}