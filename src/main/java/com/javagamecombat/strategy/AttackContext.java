package com.javagamecombat.strategy;

import com.javagamecombat.models.Weapon;

public class AttackContext {
    // L'arma non può essere cambiata
    private final Weapon weapon;
    // La stance, o meglio strategia di attacco invece sì
    private AttackStrategy attackStrategy;

    public AttackContext(Weapon weapon, AttackStrategy strategy) {
        this.weapon = weapon;
        this.attackStrategy = strategy;
    }

    public double attack() {
        return attackStrategy.calculateDamage(weapon);
    }
}
