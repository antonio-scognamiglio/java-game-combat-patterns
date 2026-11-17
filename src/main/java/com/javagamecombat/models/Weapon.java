package com.javagamecombat.models;

public abstract class Weapon {
    private final double damage;
    private final String name;
    private final Resource resource;
    private final double weaponCost;

    public Weapon(double damage, String name, Resource resource, double weaponCost) {
        this.damage = damage;
        this.name = name;
        this.resource = resource;
        this.weaponCost = weaponCost;
    }

    public double getDamage() {
        return damage;
    }

    public String getName() {
        return name;
    }

    public double getWeaponCost() {
        return weaponCost;
    }

    protected abstract Resource getResource();

}
