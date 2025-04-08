public class Cat extends Pet{

    public Cat(String name, int age, int weight, String taxonomy, boolean healthy) {
        super(name, age, weight, taxonomy, healthy);

    }



    public String speak() {
        return("Meow Meow");
    }

    public String printInfo() {
        return("Name: "+getName()+"\nAge: "+getAge()+"\nTaxonomy: "+getTaxonomy()+"\nWeight: "+getWeight()+"\n");
    }



}
