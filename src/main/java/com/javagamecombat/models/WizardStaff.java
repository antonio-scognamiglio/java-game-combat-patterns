package com.javagamecombat.models;

public class WizardStaff extends Weapon {

    public WizardStaff(double damage, String name, double weaponCost, Resource resource) {
        super(damage, name, resource, weaponCost);
    }

    @Override
    protected Resource getResource() {
        return Resource.MANA;
    }
}
