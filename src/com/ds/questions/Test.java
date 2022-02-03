import java.util.concurrent.atomic.AtomicInteger;

class Counter {
//    private volatile int count;
//
//    public synchronized void incr() {
//        count++;
//    }
//    public int getCount() {
//        return count;
//    }
private final AtomicInteger counter = new AtomicInteger(0);

    public int getValue() {
        return counter.get();
    }
    public void incr() {
        while(true) {
            int existingValue = getValue();
            int newValue = existingValue + 1;
            if(counter.compareAndSet(existingValue, newValue)) {
                return;
            }
        }
    }
}
class Main {
    public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();
        Thread t1 = new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i < 1000; i++)
                    c.incr();
            }
        });
        Thread t2 = new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i < 1000; i++)
                    c.incr();
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Count = " + c.getValue());
    }

}
