package kmp.algorithm;

public class KMPAlgorithm {
    private String text;
    private String pattern;

    public KMPAlgorithm(String text, String pattern) throws IllegalArgumentException {
        if (text == null || pattern == null || text.isEmpty() || pattern.isEmpty()) {
            throw new IllegalArgumentException("Text and pattern cannot be null or empty.");
        }
        this.text = text;
        this.pattern = pattern;
    }

    public SearchResult searchPattern() {
        int[] lps = LPS.computeLPSArray(pattern);
        SearchResult result = new SearchResult();
        int i = 0, j = 0;
        int n = text.length(), m = pattern.length();

        while (i < n) {
            if (pattern.charAt(j) == text.charAt(i)) {
                i++;
                j++;
            }

            if (j == m) {
                result.addMatch(i - j);
                j = lps[j - 1];
            } else if (i < n && pattern.charAt(j) != text.charAt(i)) {
                if (j != 0) {
                    j = lps[j - 1];
                } else {
                    i++;
                }
            }
        }
        return result;
    }
}
