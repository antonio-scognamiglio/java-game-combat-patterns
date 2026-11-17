package com.javagamecombat.strategy;

import com.javagamecombat.models.Weapon;

public class FastAttack implements AttackStrategy {

    @Override
    public double calculateDamage(Weapon weapon) {
        return weapon.getDamage() * 0.5; // Meno danno perché è l'attacco rapido
    }

    @Override
    public double getCost() {
        return 0.5; // Costo basso perché l'attaco rapido
    }
}