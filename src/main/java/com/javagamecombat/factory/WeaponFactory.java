package com.javagamecombat.factory;

import com.javagamecombat.models.Weapon;
import com.javagamecombat.models.Sword;
import com.javagamecombat.models.Bow;
import com.javagamecombat.models.Resource;
import com.javagamecombat.models.WizardStaff;

public class WeaponFactory {

    // Scelgo quale arma creare in base al tipo richiesto.
    public Weapon createWeapon(String type) {

        if ("sword".equalsIgnoreCase(type)) {
            return new Sword(10.0, "Sword", 15.0, Resource.STAMINA);

        } else if ("bow".equalsIgnoreCase(type)) {
            return new Bow(8.0, "Bow", 7.0, Resource.ARROWS);

        } else if ("staff".equalsIgnoreCase(type)) {
            return new WizardStaff(12.0, "Wizard Staff", 10.0, Resource.MANA);
        }

        System.out.println("Unknown weapon type.");
        return null;
    }
}
