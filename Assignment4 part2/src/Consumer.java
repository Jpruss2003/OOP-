public class Consumer implements Runnable {
    private PersonBuffer buffer;

    public Consumer(PersonBuffer buffer) {
        this.buffer = buffer;
    }

    public void run() {
        for (int i = 0; i <= 10; i++) {
            while (buffer.getPerson() == null) {
                Thread.yield();
            }
            Person person = buffer.getPerson();
            buffer.setPerson(null);
            System.out.println("Consumed" + person);
        }
        try {
            Thread.sleep(150);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.err.println("Consumer Failed in main, Finishing...");
        }

        System.out.println("Consumer Finished");
    }
}
