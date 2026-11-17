package com.javagamecombat.models;

public class WizardStaff extends Weapon{
    private double neededMana;

    public WizardStaff(double damage, String name, double neededMana){
        super(damage, name);
        this.neededMana = neededMana;
    }

    @Override 
    public void attack(Player player){
        if(player.consumeMana(neededMana)){
            System.out.println("Player attacked with " +getName()
            + " for " + getDamage() + " damage.");
        }else{
            System.out.println("Not enough mana to attack with " + getName());
        }
    }
}
