package fr.nathael;

public class TriangleDePascal {
    public static void main(String[] args) {
        // Triangle de nombre de Pascal
        for ( int i = 0; i < 10; i++) {
            for ( int j =0; j <= i; j++) {
                System.out.print(" "+j*i);
            }
            System.out.println();
        }
    }
}
