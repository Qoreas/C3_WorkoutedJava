package P2_Generics.L6_Examples.V1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Team<T extends Participant> {
    private String name;
    private List<T> participants = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public void addNewParticipant(T p) {
        participants.add(p);
        System.out.println("Team " + name + " added new participant named " + p.getName());
    }

    public void playWith(Team team) {
        Random r = new Random();
        String winner;

        int i = r.nextInt(2);
        if (i == 0) {
            winner = this.name;
        } else {
            winner = team.name;
        }

        System.out.println("Winner is " + winner);
    }
}
