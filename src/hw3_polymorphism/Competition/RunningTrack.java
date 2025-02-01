package hw3_polymorphism.Competition;

public class RunningTrack implements Roadblock{

    private int distance;

    public RunningTrack(int distance) {
        this.distance = distance;
    }

    @Override
    public void overcome(Participant participant) {
        participant.run(distance);
    }
}
