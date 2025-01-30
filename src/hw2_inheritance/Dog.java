package hw2_inheritance;

public class Dog extends Animal {

    private static int dogCount = 0;

    public Dog(String name) {
        super(name);
        dogCount++;
    }

    @Override
    public void run(int distance) {
        if (distance > 500 || distance < 0) {
            System.out.println("Dog " + getName() + " cannot run " + distance + " meters");
        } else super.run(distance);
    }

    @Override
    public void swim(int distance) {
        if (distance > 10 || distance < 0) {
            System.out.println("Dog " + getName() + " cannot swim!");
        } else super.swim(distance);
    }

    public static int getDogCount() {
        return dogCount;
    }

}
