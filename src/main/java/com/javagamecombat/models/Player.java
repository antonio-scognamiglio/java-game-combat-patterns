package com.javagamecombat.models;

public class Player {

    private double health;
    private double stamina;
    private double mana;
    private int arrows;
    private Weapon weapon;

    public Player(double health, double stamina, double mana, int arrows, Weapon weapon) {
        this.health = health;
        this.stamina = stamina;
        this.mana = mana;
        this.arrows = arrows;
        this.weapon = weapon;
    }

    public boolean consumeStamina(double amount) {
        if (stamina >= amount) {
            stamina -= amount;
            return true;
        }
        return false;
    }
}
