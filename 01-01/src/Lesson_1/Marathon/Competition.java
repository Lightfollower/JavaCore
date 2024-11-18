package Lesson_1.Marathon;

import Lesson_1.Marathon.competitors.Competitor;
import Lesson_1.Marathon.competitors.Team;
import Lesson_1.Marathon.obstacles.Course;
import Lesson_1.Marathon.obstacles.Obstacle;

import java.util.ArrayList;

public class Competition {

    Team team;
    Course course;

    public Competition() {
        team = new Team();
        course = new Course();
    }

    public Competition(Team team, Course course) {
        this.team = team;
        this.course = course;
    }

    public void start() {
        for (Competitor c : team.getCompetitors()) {
            for (Obstacle o : course.getObstacles()) {
                o.doIt(c);
                if (!c.isOnDistance()) break;
            }
        }
        for (Competitor c : team.getCompetitors()) {
            c.info();
        }
    }
}
