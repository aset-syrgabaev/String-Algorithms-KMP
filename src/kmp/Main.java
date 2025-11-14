package kmp;

import kmp.algorithm.KMPAlgorithm;
import kmp.algorithm.SearchResult;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("Testing on short string:");
            KMPAlgorithm search1 = new KMPAlgorithm("abcabcabcabc", "abc");
            SearchResult result1 = search1.searchPattern();
            result1.printMatches();

            System.out.println("\nTesting on medium string:");
            KMPAlgorithm search2 = new KMPAlgorithm("ababcababcab", "ababc");
            SearchResult result2 = search2.searchPattern();
            result2.printMatches();

            System.out.println("\nTesting on long string:");
            KMPAlgorithm search3 = new KMPAlgorithm("bananabananabanana", "banana");
            SearchResult result3 = search3.searchPattern();
            result3.printMatches();

            System.out.println("\nTesting when no match found:");
            KMPAlgorithm search4 = new KMPAlgorithm("abcdefgh", "xyz");
            SearchResult result4 = search4.searchPattern();
            result4.printMatches();
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
