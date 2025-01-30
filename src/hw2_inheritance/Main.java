package hw2_inheritance;

public class Main {
    public static void main(String[] args) {

        Cat marsik = new Cat("Marsik");
        marsik.run(-5);
        marsik.swim(0);
        System.out.println("Total cats: " + Cat.getCatCount() + "\n");

        Dog diks = new Dog("Diks");
        diks.run(3550);
        diks.swim(9);
        System.out.println("Total dogs: " + Dog.getDogCount() + "\n");

        System.out.println("Total animals: " + Animal.getAnimalCount() + "\n");

    }
}
