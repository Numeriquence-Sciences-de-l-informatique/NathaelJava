package fr.nathael.POO.gestionEleve;

import java.util.ArrayList;

public class Eleve {

    private final String name;
    private final String classe;
    private final ArrayList<Integer> listesNotes = new ArrayList<Integer>();
    private ArrayList<String> friends = new ArrayList<String>();
    private double moyenne;

    public Eleve(String name, String classe) {
        this.name = name;
        this.classe = classe;
        this.friends = new ArrayList<>();
    }

    public double getMoyenne() {
        return moyenne;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Integer> getListesNotes() {
        return listesNotes;
    }

    public ArrayList<String> getListeFriends() {
        return friends;
    }

    public void addFriend(String friend) {

    }


    public void addNote(int note) {
        int nbNotes = this.listesNotes.size();
        if ( note <= 0) note=0;
        else if (note > 20) note = 20;
        this.moyenne = (this.moyenne * nbNotes + note) / (nbNotes + 1);
        listesNotes.add(note);
    }

    public String toString() {
        return name + " en " + classe;
        // return name + " (" + (int)(100 * moyenne)/100.0 + ")";
    }


}
