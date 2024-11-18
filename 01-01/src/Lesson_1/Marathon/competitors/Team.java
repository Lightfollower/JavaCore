package Lesson_1.Marathon.competitors;

import java.util.ArrayList;
import java.util.Arrays;

public class Team {
    ArrayList<Competitor> competitors;

    public Team() {
        competitors = new ArrayList<>(Arrays.asList(new Competitor[]{new Human("Боб"), new Cat("Барсик"), new Dog("Бобик")}));
    }

    public Team(Competitor... competitors) {
        this.competitors = new ArrayList<>(Arrays.asList(competitors));
    }

    public void addCompetitor(Competitor competitor) {
        competitors.add(competitor);
    }

    public ArrayList<Competitor> getCompetitors() {
        return competitors;
    }
}
