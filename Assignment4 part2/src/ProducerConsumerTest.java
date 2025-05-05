public class ProducerConsumerTest {
    public static void main(String[] args) throws InterruptedException {
        PersonBuffer sharedBuffer = new PersonBuffer();
        Thread producer = new Thread( new Producer(sharedBuffer));
        Thread consumer = new Thread( new Consumer(sharedBuffer));
        producer.start();
        try {
            Thread.sleep(1);
        }
        catch (InterruptedException ex) {
            System.out.println("Sleep interrupted");
        }
        consumer.start();
    }
}
