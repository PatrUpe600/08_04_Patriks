public class Dog extends Pet{

    public Dog(String name, int age, int weight, String taxonomy, boolean healthy) {
        super(name, age, weight, taxonomy, healthy);

    }



    public String speak() {
        return("Bark Bark");
    }

    public String printInfo() {
        return("Name: "+getName()+"\nAge: "+getAge()+"\nTaxonomy: "+getTaxonomy()+"\nWeight: "+getWeight()+"\n");
    }
}
