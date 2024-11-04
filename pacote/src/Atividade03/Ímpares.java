package Atividade03;

public class Ímpares implements Runnable {
    private final Object lock;
    int ímpar = 1;

    public Ímpares(Object lock){
        this.lock = lock;
    }

    public void run(){
        synchronized (lock){
            try {
                System.out.println(ímpar);
                ímpar += 2;
                lock.notify();
                lock.wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
