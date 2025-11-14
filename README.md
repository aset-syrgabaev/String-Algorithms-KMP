
# **Bonus Task — String Algorithm Analysis**

**Student**: Aset Syrgabaev

**Course**: Design and Analysis of Algorithms

**Instructor**: Aidana Aidynkyzy

**Repository**: [GitHub Repository](https://github.com/aset-syrgabaev/String-Algorithms-KMP)

---

## **1. Purpose**

This repository contains the implementation and analysis of the **Knuth-Morris-Pratt (KMP)** string matching algorithm, which is used to efficiently search for occurrences of a pattern within a text. The task is part of the **Bonus Task** for the **Design and Analysis of Algorithms** course. The project focuses on the following areas:

* **KMP Algorithm** for efficient substring matching.
* **Time Complexity** analysis of the algorithm with different string lengths and pattern sizes.
* **Performance Analysis** using multiple datasets and visualizations.
* **Graphical representation** of the algorithm's performance.

---

## **2. Project Structure**

```
String-Algorithms-KMP/
├── README.md
├── performance_data.csv
├── results/
│   ├── performance_vs_text_length.png
│   ├── random_vs_same_data.png
│   └── time_vs_pattern_length.png
├── src/
│   ├── kmp/
│   │   ├── algorithm/
│   │   │   ├── KMPAlgorithm.java
│   │   │   ├── LPS.java
│   │   │   └── SearchResult.java
│   │   ├── exception/
│   │   │   └── CustomException.java
│   │   │
│   │   ├── performance/
│   │   │   └── PerformanceTest.java
│   │   ├── util/
│   │   │   └── StringUtils.java
│   │   └── Main.java
└── │
    └── ...
```

---

## **3. Algorithm Description**

The **Knuth-Morris-Pratt (KMP)** algorithm is a linear time complexity string matching algorithm used for finding all occurrences of a pattern in a text. The algorithm works in two phases:

1. **Preprocessing Phase**: Computes the **LPS Array** for the given pattern.
2. **Matching Phase**: Uses the LPS array to skip unnecessary comparisons and efficiently search the pattern in the text.

The time complexity of the KMP algorithm is **O(n + m)**, where **n** is the length of the text and **m** is the length of the pattern.

---

## **4. Data Flow**

The algorithm works as follows:

1. **Preprocessing**: The KMP algorithm first computes the **LPS Array** for the given pattern.
2. **Matching**: Using the precomputed LPS Array, the algorithm searches for all occurrences of the pattern in the text efficiently.

---

## **5. Packages**

* **kmp.algorithm** — Contains the core KMP Algorithm logic, including **KMPAlgorithm.java** for searching, **LPS.java** for computing the LPS Array, and **SearchResult.java** for storing and displaying the results.
* **kmp.performance** — Contains **PerformanceTest.java**, which is used to test the algorithm with different datasets and measure its performance.
* **kmp.Main** — The entry point of the program that runs the tests and visualizes the results.

---

## **6. Datasets**

The project uses various test strings to analyze the performance of the KMP algorithm. These strings are divided into three categories based on length:

| Dataset Type | Example Strings          | Length  | Pattern Length | Notes          |
| ------------ | ------------------------ | ------- | -------------- | -------------- |
| Small        | "abc", "abcd", "abcabc"  | 3–10    | 3–5            | Small strings  |
| Medium       | "ababcababcab", "banana" | 10–50   | 3–7            | Mixed patterns |
| Large        | "a" * 100, "abcabc" * 50 | 100–500 | 10–20          | Large inputs   |

Each string is tested for performance on the KMP algorithm, with varying lengths and pattern sizes.

---

## **7. Metrics**

The project includes the following **performance metrics**:

| Metric            | Description                          | Used In              |
| ----------------- | ------------------------------------ | -------------------- |
| **executionTime** | Time taken for matching process      | KMP Algorithm        |
| **comparisons**   | Number of character comparisons      | KMP Algorithm        |
| **patternLength** | Length of the pattern being searched | Performance Analysis |
| **textLength**    | Length of the text to be searched    | Performance Analysis |

---

## **8. Figures and Results**

### **Graph 1: Time vs Text Length**

*(data/performance_vs_text_length.png)*

This graph shows how the KMP algorithm's execution time increases as the length of the text grows. The time complexity of the algorithm is expected to grow linearly with the text size.

![Performance vs Text Length](./results/performance_vs_text_length.png)

### **Graph 2: Time vs Pattern Length**

*(data/performance_vs_pattern_length.png)*

This graph compares the execution time as the length of the pattern changes. Longer patterns tend to result in longer search times, but the KMP algorithm's efficiency ensures that the time does not grow exponentially.

![Performance vs Pattern Length](./results/performance_vs_pattern_length.png)

### **Graph 3: Random vs Same Data**

*(data/random_vs_same_data.png)*

This graph compares the performance of the algorithm when searching through random strings versus strings with repetitive patterns. The results show how the KMP algorithm performs differently based on the structure of the text.

![Random vs Same Data](./results/random_vs_same_data.png)

---

## **9. Running the Project**

### 1. Build and Package:

To build and package the project, run the following command:

```bash
mvn clean package
```

### 2. Run Default Dataset:

To run the program with the default dataset, execute:

```bash
java -cp target/String-Algorithms-KMP-1.0-SNAPSHOT.jar kmp.Main
```

### 3. Run Custom Dataset:

You can run the program with a specific dataset by providing the path to the JSON file:

```bash
java -cp target/String-Algorithms-KMP-1.0-SNAPSHOT.jar kmp.Main data/small_1.json
```

### 4. Run Tests:

To run the tests, use Maven:

```bash
mvn test
```

---

## **10. Commands Summary**

For your convenience, here’s a summary of the commands:

```bash
git add .
git commit -m "Final Bonus Task version"
git push origin main

mvn clean package
java -cp target/String-Algorithms-KMP-1.0-SNAPSHOT.jar kmp.Main
mvn test
```

---

## **11. Conclusion**

The KMP algorithm is implemented correctly and performs efficiently on the provided datasets. The project includes various metrics to measure performance, and several graphs visualize the results. All requirements for the **Bonus Task** have been met, and the project is ready for submission.

---

### **Notes**:

* This **README.md** is structured to clearly explain the purpose, data, metrics, figures, and instructions for running the project.
* It includes all necessary visualizations and ensures the report is complete.
* Make sure all the graphs and results are included and displayed properly in **README.md** on GitHub.

---
