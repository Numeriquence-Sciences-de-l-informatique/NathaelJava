package fr.nathael.POO.gestionEleve;

public class TestEleve {

    public static void main(String[] arg) {
        int[] notes = new int[]{17,18,15,19,5,10,20};
        TestEleve("Nathael", "TG2", notes);
    }

    public static void TestEleve(String name, String classe, int[] listNotes) {
        Eleve eleve = new Eleve(name, classe);
        for(int listNote : listNotes) {
            eleve.addNote(listNote);
            System.out.println("Moyenne de " + eleve.getName() +
                    " : " + eleve.getMoyenne());

        }
        System.out.println(eleve);

    }

}
