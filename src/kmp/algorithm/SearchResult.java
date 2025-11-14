package kmp.algorithm;

import java.util.ArrayList;
import java.util.List;

public class SearchResult {
    private List<Integer> matches;

    public SearchResult() {
        matches = new ArrayList<>();
    }

    public void addMatch(int index) {
        matches.add(index);
    }

    public void printMatches() {
        if (matches.isEmpty()) {
            System.out.println("No matches found.");
        } else {
            for (int index : matches) {
                System.out.println("Pattern found at index " + index);
            }
        }
    }

    public List<Integer> getMatches() {
        return matches;
    }
}
