class LockBThenA extends Thread {

    private Object obj1;
    private Object obj2;

    public LockBThenA(String nameThread, Object obj1, Object obj2){
        super(nameThread);
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    public void run() {

        synchronized(obj2) {
            System.out.println(Thread.currentThread().getName() + " - PRESO LOCK B");

            synchronized(obj1) {
                System.out.println(Thread.currentThread().getName() + " - PRESO LOCK A");
            }
        }

        System.out.println(Thread.currentThread().getName() + " - FINITO");
    }

}
