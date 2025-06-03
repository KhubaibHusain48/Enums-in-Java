package Concepts.Enums;

public class enums {
    public static void main(String[] args) {
        TrafficLight colour = TrafficLight.YELLOW;
        colour = TrafficLight.GREEN;
        colour = TrafficLight.RED;

        TrafficLight color=TrafficLight.valueOf("GREEN");

        for (TrafficLight v : TrafficLight.values()) {
            System.out.println(v);
        }
    }
}
