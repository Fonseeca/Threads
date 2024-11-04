package Atividade05;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Main {
    public static void main(String[] args){
        final Queue<Integer> fila = new ArrayBlockingQueue<>(10);
        Object lock = new Object();

        Produtor produtor = new Produtor(fila, lock);
        Consumidor consumidor = new Consumidor(fila, lock);

        Thread pThread = new Thread(produtor);
        Thread cThread = new Thread(consumidor);

        pThread.start();
        cThread.start();
    }
}
