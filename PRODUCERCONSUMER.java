import java.util.Scanner;

class Shared {
    int item;
    boolean available = false;

    synchronized void produce(int val) throws InterruptedException {
        while (available) wait();
        item = val;
        System.out.println("Produced: " + item);
        available = true;
        notify();
    }

    synchronized void consume() throws InterruptedException {
        while (!available) wait();
        System.out.println("Consumed: " + item);
        available = false;
        notify();
    }
}

public class ProducerConsumer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of items to produce/consume: ");
        int n = sc.nextInt();

        Shared s = new Shared();

        Thread producer = new Thread(() -> {
            try {
                for (int i = 1; i <= n; i++)
                    s.produce(i);
            } catch (InterruptedException e) {}
        });

        Thread consumer = new Thread(() -> {
            try {
                for (int i = 1; i <= n; i++)
                    s.consume();
            } catch (InterruptedException e) {}
        });

        producer.start();
        consumer.start();

        sc.close();
    }
}
