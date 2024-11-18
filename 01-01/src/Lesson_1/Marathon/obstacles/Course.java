package Lesson_1.Marathon.obstacles;

import Lesson_1.Marathon.competitors.Competitor;

import java.util.ArrayList;
import java.util.Arrays;

public class Course {

    ArrayList<Obstacle> obstacles;

    public Course(){
        this.obstacles = new ArrayList<>(Arrays.asList(new Obstacle[]{new Cross(80), new Wall(2), new Wall(20), new Cross(120)}));
    }

    public Course(Obstacle... obstacles){
        this.obstacles = new ArrayList<>(Arrays.asList(obstacles));

    }

    public void addObstacle(Obstacle obstacle){
        obstacles.add(obstacle);
    }

    public ArrayList<Obstacle> getObstacles() {
        return obstacles;
    }
}
