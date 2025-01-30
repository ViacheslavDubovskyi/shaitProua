package hw2_inheritance;

public class Animal {

    private String name;
    private static int animalCount = 0;

    public Animal(String name) {
        this.name = name;
        animalCount++;
    }

    public void run(int distance) {

        System.out.println(getName() + " run " + distance + " meters");
    }

    public void swim(int distance) {
        System.out.println(getName() + " swim " + distance + " meters");
    }

    public String getName() {
        return name;
    }

    public static int getAnimalCount() {
        return animalCount;
    }
}
