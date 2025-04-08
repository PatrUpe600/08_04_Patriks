public class Turtle extends Pet {

    public Turtle(String name, int age, int weight, String taxonomy, boolean healthy) {
        super(name, age,  weight, taxonomy, healthy);
    }




    public String speak() {
        return("Aaaw Aaaw");
    }

    public String printInfo() {
        return("Name: "+getName()+"\nAge: "+getAge()+"\nTaxonomy: "+getTaxonomy()+"\nWeight: "+getWeight()+"\n");
    }

}
