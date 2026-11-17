package com.javagamecombat.models;

import com.javagamecombat.strategy.AttackStrategy;

//Il player è il context, è lui che cambia la strategy
public class Player {

    private double health;
    private AttackStrategy strategy;

    private double stamina;
    private double mana;
    // Poi lo risolviamo e vediamo come gestire l'int
    private int arrows;
    private Weapon weapon;

    public Player(double health, double stamina, double mana, int arrows, Weapon weapon,
            AttackStrategy attackStrategy) {
        this.health = health;
        this.stamina = stamina;
        this.mana = mana;
        this.arrows = arrows;
        this.weapon = weapon;
        this.strategy = attackStrategy;
    }

    public void consume(Resource r, double amount) {
        switch (r) {
            case STAMINA:
                consumeStamina(amount);
                break;
            case ARROWS:
                consumeArrows(amount);
                break;
            case MANA:
                consumeMana(amount);
                break;
        }
    }

    private void consumeStamina(double amount) {
        stamina -= amount;
    }

    private void consumeArrows(double amount) {
        arrows -= Math.ceil(amount);
    }

    private void consumeMana(double amount) {
        mana -= amount;
    }

    public void setStrategy(AttackStrategy s) {
        this.strategy = s;
    }

    public double attack() {
        Resource resource = weapon.getResource();
        // Ogni Strategia ha un costo, ma il costo è legato all'arma
        double cost = strategy.getCost(weapon);
        if (!canAfford(resource, cost))
            return 0;
        consume(resource, cost);
        return strategy.calculateDamage(weapon);
    }

    public boolean canAfford(Resource r, double amount) {
        switch (r) {
            case STAMINA:
                return stamina >= amount;
            case ARROWS:
                return arrows >= Math.ceil(amount);
            case MANA:
                return mana >= amount;
        }
        return false;
    }

}
