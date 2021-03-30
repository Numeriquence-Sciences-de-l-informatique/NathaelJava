package fr.nathael.Algorithme;

import java.util.Arrays;

public class triSelection {

    public static void main(String[] args) {
        int[] tab = new int[]{4,1,3,9,3,1,0,3};
        triSelection(tab);
    }

    public static void triSelection(int[] tab){
        System.out.println(Arrays.toString(tab));

        for (int i = 0; i < tab.length; i++) {
            int index = i;
            for (int j = i + 1; j < tab.length; j++) {
                if (tab[j] < tab[index]) {
                    index = j;
                }
            }
            int min = tab[index];
            tab[index] = tab[i];
            tab[i] = min;
        }
        System.out.println(Arrays.toString(tab));
    }
}
