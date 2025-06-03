
---

# Java Enum Example — TrafficLight

## Description

This project illustrates the use of **Java Enums** by modeling a traffic light system. It showcases how to define enums with properties and methods, how to use `valueOf` and iterate through all enum constants.

## Features

* Defines a `TrafficLight` enum with three constants: RED, YELLOW, and GREEN.
* Each enum constant holds an associated action string (`Stop`, `Ready`, `Go`).
* Demonstrates usage of enum constants, `valueOf` method, and iterating over enum values.

## Code Structure

* `TrafficLight` enum: Defines the traffic light colors and their corresponding actions.
* `enums` class: Contains the `main` method to demonstrate enum usage, including:

  * Assigning enum values.
  * Using `valueOf` to get enum from a string.
  * Iterating through all enum constants.

## How to Run

1. Compile the classes:

   ```bash
   javac Concepts/Enums/*.java
   ```

2. Run the main class:

   ```bash
   java Concepts.Enums.enums
   ```

3. Expected output:

   ```
   RED
   YELLOW
   GREEN
   ```

## Requirements

* Java JDK 8 or above
* Basic understanding of enums in Java

## Notes

* Enums provide a type-safe way to represent fixed sets of constants.
* This example includes constructor and a field inside the enum to associate data with each constant.

## License

This project is open source for educational use.

---

