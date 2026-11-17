package com.javagamecombat.models;

public class Bow extends Weapon {

    public Bow(double damage, String name, double weaponCost, Resource resource) {
        super(damage, name, resource, weaponCost);
    }

    @Override
    protected Resource getResource() {
        return Resource.ARROWS;
    }

}
