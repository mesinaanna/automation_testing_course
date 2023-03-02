package md.tekwill.homework.lesson7;

public class Persona {

    public String name;
    private String lastName;
    int age;
    private String gender;
    private float weight;


    public void setLastName(String lastName){

        this.lastName = lastName;
    }

    public String getLastName(){

        return this.lastName;
    }

    public void setGender(String gender){

        this.gender = gender;
    }

    public String getGender(){
        return this.gender;
    }

    public void setWeight(float weight){
        this.weight = weight;
    }

    public float getWeight(){
        return this.weight;
    }

}
