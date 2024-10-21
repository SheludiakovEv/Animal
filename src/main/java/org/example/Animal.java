package org.example;

public class Animal {
    private String name;
    private int age;
    private double weight;
    private String color;

    public Animal(String name, int age, double weight, String color) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = color;
    }

    // Getters and Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public double getWeight() { return weight; }
    public void setWeight(double weight) { this.weight = weight; }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    public void Say() {
        System.out.println("Я говорю");
    }

    public void Go() {
        System.out.println("Я иду");
    }

    public void Drink() {
        System.out.println("Я пью");
    }

    public void Eat() {
        System.out.println("Я ем");
    }

    @Override
    public String toString() {
        String yearWord = (age % 10 == 1 && age % 100 != 11) ? "год" :
                (age % 10 >= 2 && age % 10 <= 4 && (age % 100 < 10 || age % 100 >= 20)) ? "года" : "лет";
        return String.format("Привет! Меня зовут %s, мне %d %s, я вешу - %.2f кг, мой цвет - %s", name, age, yearWord, weight, color);
    }
}
