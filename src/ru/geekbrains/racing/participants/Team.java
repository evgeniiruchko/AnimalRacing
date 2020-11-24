package ru.geekbrains.racing.participants;


public class Team {
    String name;
    Animal[] animals;
    Robot[] robots;

    public Team(String name, Animal[] animals){
        this.name = name;
        this.animals = animals;
    }

    public Team(String name, Robot[] robots){
        this.name = name;
        this.robots = robots;
    }

    public void infoTeam(){
        System.out.println("Команда " + name + ". Участники:");
        for (Animal a : animals)
        {
            a.info();
        }
        for (Robot r : robots)
        {
            r.info();
        }
    }

}
