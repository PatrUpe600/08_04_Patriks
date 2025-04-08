import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Pet {
    private String name;
    private int age;
    private int weight;
    private String taxonomy;
    private boolean healthy;
    private static ArrayList<Pet> petData = new ArrayList<Pet>();

    private static ArrayList<Pet> acetreatData = new ArrayList<Pet>();
    private static ArrayList<Pet> cartreatData = new ArrayList<Pet>();
    private static ArrayList<Pet> othertreatData = new ArrayList<Pet>();

    public Pet (String name, int age, int weight, String taxonomy, boolean healthy) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.taxonomy = taxonomy;
        this.healthy = true;
    }


    public String acepromazine() {
        double ace = (getWeight()/2.220462)*(0.03/10);
        ace = (double) Math.round(ace * 1000) /1000;
        return("Acepromazine dosage is "+ace);
    }
    public String carprofen() {
        double car = (getWeight()/2.220462)*(0.03/10);
        car = (double) Math.round(car * 1000) /1000;
        return("Carprofen dosage is "+car);
    }
    public String othertreat() {
        return("Other treatment was used");
    }

    public static void writeFile() {
        try {
            FileWriter fw = new FileWriter("info.txt", true);
            for (Pet pet : petData) {
                fw.write(pet.printInfo() + "\n");
                fw.write("------------------------\n");
            }
            for (Pet pet : acetreatData) {

                fw.write(pet.acepromazine()+ "\n");
                fw.write("------------------------\n");
            }
            for (Pet pet : cartreatData) {

                fw.write(pet.carprofen()+ "\n");
                fw.write("------------------------\n");
            }
            for (Pet pet : othertreatData) {

                fw.write(pet.othertreat()+ "\n");
                fw.write("------------------------\n");
            }
            fw.close();
        }
        catch(IOException e){
            throw new RuntimeException(e);
        }
    }

    public static ArrayList<Pet> getpetData() {
        return petData;
    }

    public static void addPet(Pet pet) {
        petData.add(pet);
    }
    public static void removePet(Pet pet) {
        petData.remove(pet);
    }

    public static void addAceTreat(Pet treat) {
        acetreatData.add(treat);
    }

    public static void addCarTreat(Pet treat) {
        cartreatData.add(treat);
    }

    public static void addOtherTreat(Pet treat) {
        othertreatData.add(treat);
    }




    public String speak() {
        return("Animal noise");
    }

    public String printInfo() {
        return("Name: "+name+"\nAge: "+age+"\nTaxonomy: "+taxonomy+"\nWeight: "+weight+"\n");
    }



    public String getName() { return name; }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() { return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public String getTaxonomy() {
        return taxonomy;
    }
    public void setTaxonomy(String taxonomy) {
        this.taxonomy = taxonomy;
    }

    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    
    public boolean getHealthy() {
        return healthy;
    }
    public void setHealthy(boolean healthy) {
        this.healthy = healthy;
    }
}
