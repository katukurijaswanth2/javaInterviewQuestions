package queue;

import java.util.*;

public class KthLargestElement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {3, 2, 44, 11, 32, 55, 66, 21, 77, 10};

        System.out.print("Enter the value of k: ");
        int k = sc.nextInt();

        // ---------- Kth Largest ----------
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int num : arr) {
            minHeap.offer(num);

            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }

        System.out.println("Kth Largest Element: " + minHeap.peek());

        // ---------- Kth Smallest ----------
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        for (int num : arr) {
            maxHeap.offer(num);

            if (maxHeap.size() > k) {
                maxHeap.poll();
            }
        }

        System.out.println("Kth Smallest Element: " + maxHeap.peek());
    }
}
