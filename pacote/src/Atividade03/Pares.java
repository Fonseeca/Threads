package Atividade03;

public class Pares implements Runnable{
    private final Object lock;
    int par = 0;

    public Pares(Object lock){
        this.lock = lock;
    }

    public void run(){
        synchronized (lock){
            try {
                System.out.println(par);
                par += 2;
                lock.notify();
                lock.wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
