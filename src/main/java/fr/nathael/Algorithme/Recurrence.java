package fr.nathael.Algorithme;

import java.util.*;


//Example recursive functions
public class Recurrence {
    public static void main(String[] args) {
        //GCD Demonstration
        System.out.println("The greatest common divisor of 12 and 8 is " + gcd(12, 8));
        System.out.println("The greatest common divisor of 15 and 7 is " + gcd(15, 7));

        //Collatz Demonstration:
        System.out.println("It takes " + collatzCt(5) + " iterations, starting at 5, to reach 1 with the Collatz sequence.");
        //For above, 5->16->8->4->2->1 (the number of arrows is the iteration count)
        System.out.println("It takes " + collatzCt(20) + " iterations, starting at 20, to reach 1 with the Collatz sequence.");
        //For above, 20->10->5->16->8->4->2->1

        //Reverse Demonstration
        LinkedList<Integer> myList = new LinkedList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println("The reverse of " + myList + " is " + reverse(myList));
        myList = new LinkedList<Integer>(Arrays.asList(5, 4, 32, 4125, -123521));
        System.out.println("The reverse of " + myList + " is " + reverse(myList));

        //Up-Arrow Demonstration (I'm using | to be an "up arrow" for text formatting purposes
        //To check work, see http://en.wikipedia.org/wiki/Knuth%27s_up-arrow_notation#Tables_of_values
        System.out.println("3||2 = " + upArrow(3, 2, 2));
        System.out.println("3||3 = " + upArrow(3, 2, 3));
        System.out.println("3|||2 = " + upArrow(3, 3, 2));
        System.out.println("2|||3 = " + upArrow(2, 3, 3));
    }

    //Assume a >= b and b >= 0
    public static int gcd(int a, int b) {
        if (b==0) return a; //Initial condition: gcd(a, 0) = a

        return gcd(b, a%b); //Recursive call (Euclidean algorithm)
    }

    //See http://oeis.org/A127824 for related information
    public static int collatzCt(int n) {
        //Initial condition: it takes 0 iterations to get to 1 from 1.
        if (n == 1) return 0;

        if (n % 2 == 0) //Even branch of Collatz sequence
            return 1+collatzCt(n/2); //If n is even, n->n/2
        else //Odd branch of Collatz sequence
            return 1+collatzCt(3*n + 1); //if n is odd, n->3*n+1
    }


    public static LinkedList<Integer> reverse(LinkedList<Integer> list) {
        //Initial condition: reverse of an empty list is an empty list
        if (list.isEmpty()) return new LinkedList<Integer>();

        Integer oldFirst = list.removeFirst(); //Take first element from list
        LinkedList<Integer> reversedPart = reverse(list); //Reverse the remaining part of the list (recursive)
        reversedPart.add(oldFirst); //Append the (old) first element to the end of the list

        return reversedPart;
    }

    //I'm using the variables from the definition provided on Wikipedia
    //http://en.wikipedia.org/wiki/Knuth%27s_up-arrow_notation#Definition
    //This would be a terrible test question...
    public static long upArrow(long a, int n, long b) {
        if (n == 0)  return a*b; //Initial condition 1
        if (n >= 1 && b == 0) return 1; //Initial condition 2

        return upArrow(a, n-1, upArrow(a, n, b-1)); //Recursive call
    }
}
