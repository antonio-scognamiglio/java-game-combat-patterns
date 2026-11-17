package com.javagamecombat.strategy;

import com.javagamecombat.models.Weapon;

public interface AttackStrategy {
    double calculateDamage(Weapon weapon);

    double getCost(Weapon weapon);
}
