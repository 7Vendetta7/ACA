package com.company.string;

import java.util.*;

/**
 * Function Description
 *
 * Complete the isAnagram function in the editor.
 *
 * isAnagram has the following parameters:
 *
 * string a: the first string
 * string b: the second string
 * Returns
 *
 * boolean: If a and b are case-insensitive anagrams, return true. Otherwise, return false.
 * Input Format
 *
 * The first line contains a string a.
 * The second line contains a string b.
 *
 * Constraints
 *
 * 1 <= length(a), length(b), <= 50
 * Strings a and b consist of English alphabetic characters.
 * The comparison should NOT be case sensitive.
 *
 * @author Argishti_Tigranyan
 */

public class SecondTask {

    public static void isAnagram(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the first string: ");
        String firstString = scanner.nextLine();
        System.out.print("Please enter the second string: ");
        String secondString = scanner.nextLine();

        char[] firstStringArray = firstString.toLowerCase().toCharArray();
        char[] secondStringArray = secondString.toLowerCase().toCharArray();

        Arrays.sort(firstStringArray);
        Arrays.sort(secondStringArray);

        System.out.println(Arrays.equals(firstStringArray, secondStringArray));
    }
}
