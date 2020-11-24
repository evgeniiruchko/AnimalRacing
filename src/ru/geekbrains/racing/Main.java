package ru.geekbrains.racing;

import ru.geekbrains.racing.obstacles.Cross;
import ru.geekbrains.racing.obstacles.Obstacle;
import ru.geekbrains.racing.obstacles.Wall;
import ru.geekbrains.racing.obstacles.Water;
import ru.geekbrains.racing.participants.*;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = {new Cat("Barsik", Color.RED), new Dog("Bobik", Color.BLACK), new Duck("Scrooge", Color.WHITE)};
        Robot[] robots = {new Robot ("Cop","Robocop","USA", 10, 100)};
        Obstacle[] obstacles = {new Cross(100), new Wall(10), new Water(15)};

        Team team = new Team("Животные", animals);
        team.infoTeam();



    }
}
