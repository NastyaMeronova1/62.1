package com.company;

public class Main {

    public static void main(String[] args) {
        Singleton first = Singleton.getInstance("Muhammad", "Abdullah",33);
        Singleton second = Singleton.getInstance("Kareem", "Salam", 22);
        boolean comparison = first == second;
        System.out.println("Comparison first and second singletons: " + comparison);

        System.out.println("First singleton - " + first.getName() + " " + first.getSecondName() + " " + first.getAge());
        System.out.println("Second singleton - "+ second.getName() + " " + second.getSecondName() + " " + second.getAge());
    }
}

class Singleton {
    private static Singleton instance;
    private String name;
    private String secondName;
    private int age;

    public Singleton(String name, String secondName, int age) {
        this.name = name;
        this.secondName = secondName;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSecondName() {
        return secondName;
    }

    public int getAge() {
        return age;
    }

    public static Singleton getInstance(String name, String secondName, int age) {
        if (instance == null) {
            instance = new Singleton(name, secondName, age);
        }
        return instance;
    }
}