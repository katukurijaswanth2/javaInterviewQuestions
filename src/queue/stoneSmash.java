//package queue;
//
//import java.util.Collections;
//import java.util.PriorityQueue;
//
/// *
//Problem: The Stone Smasher
//(Based on LeetCode 1046: Last Stone Weight)
//Description: You are given a collection of stones, where each stone has a positive integer weight.
//
//Every turn, you must choose the two heaviest stones and smash them together.
//Suppose the stones have weights x and y with x <= y. The result of this smash is:
//If x == y, both stones are destroyed (remove both).
//If x != y, the stone of weight x is destroyed, and the stone of weight y has new weight y - x.
//At the end, there is at most one stone left.
//
//Goal: Return the weight of the last remaining stone. If there are no stones left, return 0.
//
//| Operation         | Purpose                                              |
//| ----------------- | ---------------------------------------------------- |
//| **add / insert**  | Add an element with priority                         |
//| **peek / get**    | Retrieve highest-priority element *without removing* |
//| **poll / remove** | Retrieve and remove highest-priority element         |
//
//
//*/

package queue;

import java.util.Collections;
import java.util.PriorityQueue;

public class stoneSmash {
    public static void main(String[] args) {
        // Test case input
        int[] stones = {8, 7, 5, 4, 3, 2, 9};

        // 1. Setup Max Heap
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i : stones) {
            pq.add(i);
        }

        // 2. The Game Loop
        // Run as long as we have at least 2 stones to smash
        while (pq.size() > 1) {

            // Get the two heaviest stones
            // poll() retrieves AND removes them. No need to remove again.
            int y = pq.poll(); // Heaviest
            int x = pq.poll(); // Second heaviest

            // Logic: If they are not equal, put the difference back.
            // If they are equal, both are destroyed (we just do nothing, they are already polled).


            if (y != x) {
                pq.add(y - x);
            }
//            else{ if both are equal
//                do nothing because both are removed right


            // Debugging print to see the state after every smash
            System.out.println("Smashed " + y + " and " + x + ". Remaining pile: " + pq);
        }

        // 3. Final Result
        if (pq.isEmpty()) {
            System.out.println("Final Weight: 0");
        } else {
            // usage of .peek() to get the value inside the queue
            System.out.println("Final Weight: " + pq.peek());
        }
    }
}