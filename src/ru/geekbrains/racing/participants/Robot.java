package ru.geekbrains.racing.participants;

public  class Robot {
    String type;
    String model;
    String country;

    int maxRunDistance;
    int maxJumpHeight;

    boolean onDistance;

    public boolean isOnDistance() {
        return onDistance;
    }

    public String getType() {
        return type;
    }

    public String getModel() {
        return model;
    }

    public String getCountry() {
        return country;
    }

    public void setOnDistance(boolean onDistance) {
        this.onDistance = onDistance;
    }

    public Robot(String type, String model, String country, int maxRunDistance, int maxJumpHeight) {
        this.type = type;
        this.model = model;
        this.country = country;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
        this.onDistance = true;
    }

    public void run(int distance) {
        if (distance <= maxRunDistance) {
            System.out.println(model + " " + type + " from" + country + " - Run OK");
        } else {
            System.out.println(model + " " + type + " from" + country + " - Run FAILED");
            onDistance = false;
        }
    }

    public void jump(int height) {
        if (height <= maxJumpHeight) {
            System.out.println(model + " " + type + " from" + country + " - Jump OK");
        } else {
            System.out.println(model + " " + type + " from" + country + " - Jump FAILED");
            onDistance = false;
        }
    }

    public void info() {
        System.out.println(model + " " + type + " from" + country + ": " + onDistance);
    }
}
