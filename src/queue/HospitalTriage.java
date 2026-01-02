package queue;

import java.util.Comparator;
import java.util.PriorityQueue;

class Patient {
    String name;
    int priority;

    public Patient(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    @Override
    public String toString() {
        return name + " (Priority: " + priority + ")";
    }
}

public class HospitalTriage {
    public static void main(String[] args) {

        PriorityQueue<Patient> erQueue = new PriorityQueue<>(
                Comparator.comparingInt(p -> p.priority)
        );

        erQueue.add(new Patient("Jaswanth  (Flu)", 3));
        erQueue.add(new Patient("Samsung (Heart Attack)", 1));
        erQueue.add(new Patient("Bunny (Broken Arm)", 2));

        while (!erQueue.isEmpty()) {
            System.out.println("Doctor is treating: " + erQueue.poll());
        }
    }
}



