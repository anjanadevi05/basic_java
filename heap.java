import java.util.PriorityQueue;
public class heap {
    public static void main(String[] args) {
        // Create a priority queue
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        // Create a heap
        int[] heap = {7, 6, 5, 4, 3, 2, 1};

        // Insert the heap into the priority queue
        for (int i = 0; i < heap.length; i++) {
            priorityQueue.add(heap[i]);
        }

        // Print the priority queue
        while (!priorityQueue.isEmpty()) {
            System.out.println(priorityQueue.poll());
        }
    }
}


