package Atividade05;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Produtor implements Runnable{
    final Queue<Integer> fila;
    Object lock;
    int contador;

    public Produtor(Queue<Integer> fila, Object lock){
        this.fila = fila;
        this.lock = lock;
        this.contador = 0;
    }

    public void run(){
        synchronized (lock){
            try {
                while (true){
                    if(fila.size() == 10){
                        lock.wait();
                    }else{
                        fila.add(contador++);
                        lock.notify();
                    }
                }
            }catch (InterruptedException e){
                throw new RuntimeException(e);
            }
        }
    }
}
