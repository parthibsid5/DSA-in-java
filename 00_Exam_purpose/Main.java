public class Main {
    public void main(String[] args) {
        new Counter();
        new Counter();
        new Counter();

        Counter.displayCount(); // Outputs: Count: 3
    }
}

class Counter {
    static int count = 0; // Shared among all instances

    Counter() {
        count++; // Increment the static variable
    }

    static void displayCount() {
        System.out.println("Count: " + count);
    }
}
