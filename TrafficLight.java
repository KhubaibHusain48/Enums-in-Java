package Concepts.Enums;

public enum TrafficLight {
    RED("Stop"),YELLOW("Ready"),GREEN("Go");

    private String action;

    TrafficLight(String action) {
        this.action = action;
    }
}
