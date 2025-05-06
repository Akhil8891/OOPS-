import java.util.*;

public class DequeOperations {
    public static void main(String[] args) {
        // Create Deque object using ArrayDeque implementation
        Deque<String> deque = new ArrayDeque<>();

        // Add elements to the deque
        deque.add("car");
        deque.add("bike");
        deque.add("bus");
        deque.add("auto");

        System.out.println("Initial Deque: " + deque);

        // Remove first element using remove()
        String removedFirst = deque.remove(); // removes the head (apple)
        System.out.println("After remove() (removed first element): " + deque);
        

        // Remove second element using poll()
        String removedSecond = deque.poll(); // now removes new head (orange)
        System.out.println("After poll() (removed second element): " + deque);
        

        // Remove last element using pollLast()
        String removedLast = deque.pollLast(); // removes tail (avocado)
        System.out.println("After pollLast() (removed last element): " + deque);
        
    }
}

