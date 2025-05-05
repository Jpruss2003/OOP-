public class Producer implements Runnable {
    private PersonBuffer buffer;


    public Producer(PersonBuffer buffer) {
        this.buffer = buffer;
    }

    public void run() {
        for (int i = 0; i <= 10; i++) {
            String name = "Julius";
            Person person = new Person("Person: " + name, 20 + i);
            while(buffer.getPerson() != null){
                Thread.yield();
            }
            buffer.setPerson(person);
            System.out.println("Produced: " + person);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Producer is interrupted in main, finishing...");
                break;
            }
            System.out.println("Producer Finished");
        }

    }
}
