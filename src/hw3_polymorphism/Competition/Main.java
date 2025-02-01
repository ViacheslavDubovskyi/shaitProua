package hw3_polymorphism.Competition;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Participant[] participants = new Participant[3];
        Human steve = new Human("Steve", 250, 1.2);
        Cat john = new Cat("John", 300, 2.5);
        Robot joe = new Robot("Joe", 500, 1);
        participants[0] = steve;
        participants[1] = john;
        participants[2] = joe;

        Roadblock[] roadblocks = new Roadblock[4];
        Wall wall1 = new Wall(0.5);
        Wall wall2 = new Wall(1.2);
        RunningTrack runningTrack1 = new RunningTrack(220);
        RunningTrack runningTrack2 = new RunningTrack(340);
        roadblocks[0] = runningTrack1;
        roadblocks[1] = runningTrack2;
        roadblocks[2] = wall2;
        roadblocks[3] = wall1;

//        List<Participant> participants = new ArrayList<>();
//        Human steve = new Human("Steve", 250, 1.2);
//        Cat john = new Cat("John", 300, 2.5);
//        Robot joe = new Robot("Joe", 500, 1);
//        participants.add(steve);
//        participants.add(john);
//        participants.add(joe);
//
//        List<Roadblock> roadblocks = new ArrayList<>();
//        Wall wall1 = new Wall(0.5);
//        Wall wall2 = new Wall(1.2);
//        RunningTrack runningTrack1 = new RunningTrack(220);
//        RunningTrack runningTrack2 = new RunningTrack(340);
//        roadblocks.add(runningTrack1);
//        roadblocks.add(runningTrack2);
//        roadblocks.add(wall2);
//        roadblocks.add(wall1);

//        for (Participant p : participants) {
//            for (Roadblock r : roadblocks) {
//                if (!p.isDisqualified()) {
//                    r.overcome(p);
//                } else break;
//            }

        for (Participant p : participants) {
            for (Roadblock rb : roadblocks) {
                if (!p.isDisqualified()) {
                    rb.overcome(p);
                } else break;
            }

        }
    }
}


