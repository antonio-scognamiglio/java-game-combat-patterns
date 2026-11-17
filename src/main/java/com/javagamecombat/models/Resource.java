package com.javagamecombat.models;

public enum Resource {
    STAMINA("Stamina"),
    MANA("Mana"),
    ARROWS("Frecce");

    private final String label;

    Resource(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
