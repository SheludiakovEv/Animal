package org.example;

import java.util.ArrayList;
import java.util.Scanner;

enum Command {
    ADD, LIST, EXIT
}

public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Введите команду (add/list/exit): ");
            String input = scanner.nextLine().trim().toUpperCase();

            Command command;
            try {
                command = Command.valueOf(input);
            } catch (IllegalArgumentException e) {
                System.out.println("Неизвестная команда. Попробуйте снова.");
                continue;
            }

            switch (command) {
                case ADD:
                    System.out.print("Какое животное (cat/dog/duck): ");
                    String animalType = scanner.nextLine().trim().toLowerCase();

                    System.out.print("Введите имя: ");
                    String name = scanner.nextLine().trim();

                    System.out.print("Введите возраст: ");
                    int age = Integer.parseInt(scanner.nextLine().trim());

                    System.out.print("Введите вес: ");
                    double weight = Double.parseDouble(scanner.nextLine().trim());

                    System.out.print("Введите цвет: ");
                    String color = scanner.nextLine().trim();

                    Animal animal = null;
                    if (animalType.equals("cat")) {
                        animal = new Cat(name, age, weight, color);
                    } else if (animalType.equals("dog")) {
                        animal = new Dog(name, age, weight, color);
                    } else if (animalType.equals("duck")) {
                        animal = new Duck(name, age, weight, color);
                    } else {
                        System.out.println("Неизвестный тип животного.");
                        break;
                    }

                    animals.add(animal);
                    animal.Say();
                    break;

                case LIST:
                    for (Animal a : animals) {
                        System.out.println(a);
                    }
                    break;

                case EXIT:
                    System.out.println("Выход из программы.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Неизвестная команда. Попробуйте снова.");
            }
        }
    }
}