package com.javagamecombat.models;

public class Bow extends Weapon {

    public Bow(double damage, String name){
        super(damage, name);
    }
    
    @Override 
    public void attack(Player player){

        //attacca solo se il player ha le frecce
        if(player.consumeArrows()){
            System.out.println("Player attacked with " + getName()
            + " for " + getDamage() + " damage.");
        }else{
            System.out.println("Not enough arrows to attack with " + getName());
        }
    }
}
