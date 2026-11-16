package com.javagamecombat.models;

public class Sword extends Weapon {
    private double neededStamina;

    public Sword(double damage, String name, double neededStamina) {
        super(damage, name);
        this.neededStamina = neededStamina;
    }

    @Override
    public void attack(Player player) {
        if (player.consumeStamina(neededStamina)) {
            System.out.println("Player attacked with " + getName() + " for " + getDamage() + " damage.");
        } else {
            System.out.println("Not enough stamina to attack.");
        }
    }

}
