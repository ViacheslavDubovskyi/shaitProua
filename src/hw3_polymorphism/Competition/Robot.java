package hw3_polymorphism.Competition;

public class Robot implements Participant {
    private String name;
    private int maxDistance;
    private double maxHigh;
    private boolean isDisqualified;

    public Robot(String name, int maxDistance, double maxHigh) {
        this.name = name;
        this.maxDistance = maxDistance;
        this.maxHigh = maxHigh;
    }

    @Override
    public void run(int distance) {
        if (!(distance <= maxDistance && !isDisqualified)) {
            isDisqualified = true;
            System.out.println("Participant " + name + " has disqualified. He has not passed the distance "
                    + distance + ". He has passed " + maxDistance);
        } else System.out.println("Participant " + name + " has passed the roadblock distance " + distance);

    }

    @Override
    public void jump(double high) {
        if (!(high <= maxHigh && !isDisqualified)) {
            isDisqualified = true;
            System.out.println("Participant " + name + " has disqualified. He has not passed the high "
                    + high + ". He passed " + maxHigh);
        } else System.out.println("Participant " + name + " has passed the wall high " + high);
    }

    @Override
    public boolean isDisqualified() {
        return isDisqualified;
    }
}
