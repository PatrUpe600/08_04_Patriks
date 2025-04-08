public class Parrot extends Pet {

    public Parrot(String name, int age, int weight, String taxonomy, boolean healthy) {
        super(name, age, weight, taxonomy, healthy);

    }



    public String speak() {
        return("Eeek Eeek");
    }

    public String printInfo() {
        return("Name: "+getName()+"\nAge: "+getAge()+"\nTaxonomy: "+getTaxonomy()+"\nWeight: "+getWeight()+"\n");
    }
}
