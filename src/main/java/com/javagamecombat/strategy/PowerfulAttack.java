package com.javagamecombat.strategy;

import com.javagamecombat.models.Weapon;

public class PowerfulAttack implements AttackStrategy {

    @Override
    public double calculateDamage(Weapon weapon) {
        return weapon.getDamage() * 2.0;
    }

    @Override
    public double getCost() {
        return 2.0;
    }

}
