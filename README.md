# Travelling Salesman Problem (TSP) – Java

## 📌 Overview

The **Travelling Salesman Problem (TSP)** is a classic optimization problem where a salesman must visit every city exactly once and return to the starting city, while minimizing the total travel cost.

This project provides a **Java implementation of TSP using Dynamic Programming with Bitmasking**, which guarantees the **optimal solution** for small to medium-sized inputs.

---

## 🚀 Algorithm Used

**Dynamic Programming + Bitmasking**

* Each city is represented by a bit in a binary mask.
* `mask` tracks which cities have been visited.
* `dp[mask][pos]` stores the minimum cost to visit all remaining cities starting from `pos`.

This approach significantly improves performance over brute force solutions.

---

## 🧮 Time and Space Complexity

* **Time Complexity:** `O(N² × 2ⁿ)`
* **Space Complexity:** `O(N × 2ⁿ)`

⚠️ Due to exponential complexity, this solution is best suited for **N ≤ 20 cities**.

---

## 🛠️ Requirements

* Java 8 or later
* Any Java IDE or command-line environment

---

## 📂 Project Structure

```
TravellingSalesman.java
README.md
```

---

## ▶️ How to Run

1. Clone or download the repository
2. Compile the program:

   ```bash
   javac TravellingSalesman.java
   ```
3. Run the program:

   ```bash
   java TravellingSalesman
   ```

---

## 📊 Example Input

The distance matrix is defined in the code:

```java
int[][] dist = {
    {0, 10, 15, 20},
    {10, 0, 35, 25},
    {15, 35, 0, 30},
    {20, 25, 30, 0}
};
```

Each value represents the cost to travel between two cities.

---

## ✅ Output

```
Minimum travelling cost: 80
```

This is the minimum cost to visit all cities and return to the starting point.

---

## 🧠 Key Concepts

* Bitmasking
* Dynamic Programming
* Recursion with Memoization
* Graph Traversal

---

## 🔧 Customization

* Change the `dist` matrix to test different city configurations
* Increase the number of cities (within limits) for experimentation
* Extend the code to store and print the actual path taken

---

## 📚 References

* Bellman–Held–Karp Algorithm
* Introduction to Algorithms (CLRS)

---

## 📝 License

This project is open-source and free to use for educational purposes.
