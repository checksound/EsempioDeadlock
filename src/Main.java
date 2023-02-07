public class Main {

    public static void main(String[] args) throws InterruptedException {
        Object obj1 = new Object();
        Object obj2 = new Object();

        LockAThenB t1 = new LockAThenB("threadLockAThenB", obj1, obj2);
        LockBThenA t2 = new LockBThenA("threadLockBThenA", obj1, obj2);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("FINITA ESECUZIONE");
    }
}