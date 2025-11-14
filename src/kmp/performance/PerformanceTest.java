package kmp.performance;

import kmp.algorithm.KMPAlgorithm;
import kmp.algorithm.SearchResult;

import java.io.FileWriter;
import java.io.IOException;

public class PerformanceTest {
    public static void main(String[] args) {
        String[] testStrings = {
                "a",
                "aa",
                "aaa",
                "aaaa",
                "aaaaa",
                "aaaaaa",
                "aaaaaaa",
                "aaaaaaaa"
        };

        String pattern = "aaa";

        try (FileWriter writer = new FileWriter("performance_data.csv")) {
            writer.write("TextLength,TimeTaken\n");

            for (String text : testStrings) {
                long startTime = System.nanoTime();

                KMPAlgorithm search = new KMPAlgorithm(text, pattern);
                SearchResult result = search.searchPattern();

                long endTime = System.nanoTime();
                long duration = endTime - startTime;

                writer.write(text.length() + "," + duration + "\n");

                System.out.println("Text length: " + text.length() + " | Time taken: " + duration + " nanoseconds");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
