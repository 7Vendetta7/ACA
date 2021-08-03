package com.company.string;

import java.util.Scanner;

/**
 *
 * Given two strings of lowercase English letters, A and B, perform the following operations:
 *
 * 1. Sum the lengths of A and B.
 * 2. Determine if A is lexicographically larger than B (i.e.: does  come before  in the dictionary?).
 * 3. Capitalize the first letter in A and B and print them on a single line, separated by a space.
 *
 * The first line contains a string A. The second line contains another string B.
 * The strings are comprised of only lowercase English letters.
 *
 *
 * There are three lines of output:
 * For the first line, sum the lengths of A and B.
 * For the second line, write Yes if A is lexicographically greater than B otherwise print No instead.
 * For the third line, capitalize the first letter in both A and B and print them on a single line,
 * separated by a space.
 */

public class FirstTask {



    public static void operationsWithStrings(){

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the first string: ");
        String first = input.nextLine();

        System.out.print("Please enter the second string: ");
        String second = input.nextLine();
        System.out.println();
        System.out.println("The sum of the lengths is: "+(first.length()+second.length())+"\n");

        System.out.println("Is "+first+" lexicographically greater than "+second+" ?");
        if (first.compareTo(second) < 0){
            System.out.println("Yes\n");
        }
        else {
            System.out.println("No\n");
        }


        String capitalizedFirst = first.substring(0, 1).toUpperCase() + first.substring(1);
        String capitalizedSecond = second.substring(0, 1).toUpperCase() + second.substring(1);

        System.out.println("Let us see the capitalized version of your strings.");
        System.out.println("First String: "+capitalizedFirst);
        System.out.println("Second String: "+capitalizedSecond);
    }
}
