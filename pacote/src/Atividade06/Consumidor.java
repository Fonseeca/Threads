package Atividade06;

import java.util.Queue;

public class Consumidor implements Runnable{
    final Queue<Integer> fila;
    Object lock;

    public Consumidor(Queue<Integer> fila, Object lock){
        this.fila = fila;
        this.lock = lock;
    }

    public void run(){
        synchronized (lock){
            try {
                while (true){
                    if(fila.isEmpty()){
                        lock.wait();
                    }else{
                        fila.remove();
                        lock.notify();
                    }
                }
            }catch (InterruptedException e){
                throw new RuntimeException(e);
            }
        }
    }
}
