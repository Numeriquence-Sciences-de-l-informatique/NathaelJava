package fr.nathael.gestionEleve;

import java.util.ArrayList;

public class Eleve {

    private final String name;
    private final ArrayList<Float> listeNotes = new ArrayList<Float>();

    public Eleve(String name) {
        this.name = name;
    }

    public float getMoyenne(float notes) {
        return notes;
    }

    public float getNum( float num) {
        return num;
    }


}
