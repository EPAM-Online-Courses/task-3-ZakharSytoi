package efs.task.oop;

public class Villager implements Fighter {

    protected int health = 100;

    protected final String name;
    protected final int age;

    public Villager(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void sayHello() {
        System.out.println("Greetings traveler... I'm " + name + " and I'm " + age + " years old.");
    }

    @Override
    public void attack(Fighter victim) {
        victim.takeHit((int) ((100 - age * 0.5) / 10));
    }

    @Override
    public void takeHit(int damage) {
        health -= damage;
    }

    public int getHealth() {
        return health;
    }

    public String getName() {
        return name;
    }
}
