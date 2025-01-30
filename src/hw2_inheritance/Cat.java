package hw2_inheritance;

public class Cat extends Animal {

    private static int catCount = 0;

    public Cat(String name) {
        super(name);
        catCount++;
    }

    @Override
    public void run(int distance) {
        if (distance > 200 || distance < 0) {
            System.out.println("Cat " + getName() + " cannot run " + distance + " meters");
        } else super.run(distance);
    }

    @Override
    public void swim(int distance) {
        if (distance != 0) {
            System.out.println("Cat " + getName() + " cannot swim!");
        } else super.swim(distance);
    }

    public static int getCatCount() {
        return catCount;
    }

}
