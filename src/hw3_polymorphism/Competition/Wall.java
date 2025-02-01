package hw3_polymorphism.Competition;

public class Wall implements Roadblock{

    private double high;

    public Wall(double high) {
        this.high = high;
    }

    @Override
    public void overcome(Participant participant) {
        participant.jump(high);

    }
}
