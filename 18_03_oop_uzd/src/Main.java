import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Dog d1 = new Dog("null", 0, 0, "X", true);
        Cat c1 = new Cat("null", 0, 0, "X", true);
        Turtle t1 = new Turtle("null", 0, 0, "X", true);
        Parrot p1 = new Parrot("null", 0, 0, "X", true);


        System.out.println("Welcome to Animal Clinic!");


        System.out.println("What species is your pet? 1 - Dog, 2 - Cat, 3 - Turtle, 4 - Parrot");
        int sp = input.nextInt();

        if (sp == 1) {
            System.out.println("Please input Pet Data:");

            System.out.println("Input Pet Name");
            String n = input.next();

            System.out.println("Input Pet Age");
            int a = input.nextInt();

            System.out.println("Input Pet Weight");
            int w = input.nextInt();

            d1 = new Dog(n, a, w, "Dog", true);
            Pet.addPet(d1);
        } else if (sp == 2) {
            System.out.println("Please input Pet Data");

            System.out.println("Input Pet Name");
            String n = input.next();

            System.out.println("Input Pet Age");
            int a = input.nextInt();

            System.out.println("Input Pet Weight");
            int w = input.nextInt();

            c1 = new Cat(n, a, w, "Cat", true);
            Pet.addPet(c1);
        } else if (sp == 3) {
            System.out.println("Please input Pet Data");

            System.out.println("Input Pet Name");
            String n = input.next();

            System.out.println("Input Pet Age");
            int a = input.nextInt();

            System.out.println("Input Pet Weight");
            int w = input.nextInt();

            t1 = new Turtle(n, a, w, "Turtle", true);
            Pet.addPet(t1);
        } else if (sp == 4) {
            System.out.println("Please input Pet Data");

            System.out.println("Input Pet Name");
            String n = input.next();

            System.out.println("Input Pet Age");
            int a = input.nextInt();

            System.out.println("Input Pet Weight");
            int w = input.nextInt();

            p1 = new Parrot(n, a, w, "Parrot", true);
            Pet.addPet(p1);
        } else {
            System.out.println("Error");
        }

        System.out.println("Which treatment do you wish to use? 1 - acepromazine, 2 - carprofen, 3 - other treatment");
        int treat = input.nextInt();
        if (treat == 1) {
            if (sp == 1) {
                d1.acepromazine();
                Pet.addAceTreat(d1);
            } else if (sp == 2) {
                c1.acepromazine();
                Pet.addAceTreat(c1);
            } else if (sp == 3) {
                t1.acepromazine();
                Pet.addAceTreat(t1);
            } else if (sp == 4) {
                p1.acepromazine();
                Pet.addAceTreat(p1);
            } else {
                System.out.println("Error");
            }

        } else if (treat == 2) {
            if (sp == 1) {
                d1.carprofen();
                Pet.addCarTreat(d1);
            } else if (sp == 2) {
                c1.carprofen();
                Pet.addCarTreat(c1);
            } else if (sp == 3) {
                t1.carprofen();
                Pet.addCarTreat(t1);
            } else if (sp == 4) {
                p1.carprofen();
                Pet.addCarTreat(p1);
            } else {
                System.out.println("Error");
            }
        } else if (treat == 3) {
            if (sp == 1) {
                d1.othertreat();
                Pet.addOtherTreat(d1);
            } else if (sp == 2) {
                c1.othertreat();
                Pet.addOtherTreat(c1);
            } else if (sp == 3) {
                t1.othertreat();
                Pet.addOtherTreat(t1);
            } else if (sp == 4) {
                p1.othertreat();
                Pet.addOtherTreat(p1);
            } else {
                System.out.println("Error");
            }
        }
        else {
            System.out.println("Error");
        }

        Pet.writeFile();
        System.out.println("Pet data and Treatment information has been written");

    }
}
