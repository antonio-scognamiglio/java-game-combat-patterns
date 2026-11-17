package com.javagamecombat.models;

public class Sword extends Weapon {

    public Sword(double damage, String name, double weaponCost, Resource resource) {
        super(damage, name, resource, weaponCost);
    }

    @Override
    protected Resource getResource() {
        return Resource.STAMINA;
    }
}
