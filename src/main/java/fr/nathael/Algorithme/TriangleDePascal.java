package fr.nathael.Algorithme;

public class TriangleDePascal {
    public static void main(String[] args) {
        // Triangle de nombre de Pascal
        for ( int i = 0; i < 10; i++) {
            for ( int j =0; j <= i; j++) {
                if (j*i < 10) {
                    System.out.print(" "+j*i+ " ");
                } else {
                    System.out.print(" "+j*i);
                }

            }
            System.out.println();
        }
    }
}
