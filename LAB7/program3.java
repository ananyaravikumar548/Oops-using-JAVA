class SharedData {
    int value;
    boolean produced = false;
}

class Producer extends Thread {
    SharedData data;

    Producer(SharedData data) {
        this.data = data;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            synchronized (data) {
                while (data.produced) { // wait if data not yet consumed
                    try {
                        data.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                data.value = i;
                System.out.println("Produced: " + i);
                data.produced = true;
                data.notify(); // tell consumer to consume
            }
        }
    }
}

class Consumer extends Thread {
    SharedData data;

    Consumer(SharedData data) {
        this.data = data;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            synchronized (data) {
                while (!data.produced) { // wait if nothing to consume
                    try {
                        data.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("Consumed: " + data.value);
                data.produced = false;
                data.notify();
            }
        }
    }
}

public class SimpleProducerConsumer {
    public static void main(String[] args) {
        SharedData data = new SharedData();
        Producer p = new Producer(data);
        Consumer c = new Consumer(data);

        p.start();
        c.start();
    }
}
