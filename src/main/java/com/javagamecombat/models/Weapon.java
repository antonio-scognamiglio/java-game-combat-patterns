package com.javagamecombat.models;

public abstract class Weapon {
    private double damage;
    private String name;

    public Weapon(double damage, String name) {
        this.damage = damage;
        this.name = name;
    }

    public double getDamage() {
        return damage;
    }

    public String getName() {
        return name;
    }

    public abstract void attack(Player player);
}
