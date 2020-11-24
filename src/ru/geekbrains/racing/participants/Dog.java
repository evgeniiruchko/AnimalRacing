package ru.geekbrains.racing.participants;

public class Dog extends Animal implements Actions{

    private int maxSwimDistance;

    public Dog(String name, Color color) {
        super("Dog", name, color, 1000, 50);
        maxSwimDistance = 10;
    }

    @Override
    public void swim(int distance) {
        if (distance <= maxSwimDistance) {
            System.out.println(color.getEnglishColorName() + " " + type + " " + name + " - Swim OK");
        } else {
            System.out.println(color.getEnglishColorName() + " " + type + " " + name + " - Swim FAILED");
            onDistance = false;
        }
    }
}
