package com.javagamecombat.strategy;

import com.javagamecombat.models.Weapon;

public class NormalAttack implements AttackStrategy {

    @Override
    public double calculateDamage(Weapon weapon) {
        return weapon.getDamage() * 1.0;
    }

    @Override
    public double getCost(Weapon weapon) {
        return weapon.getWeaponCost() * 1.0;
    }

}
