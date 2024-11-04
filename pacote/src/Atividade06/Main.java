package Atividade06;


import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Main {
    public static void main(String[] args){
        final Queue<Integer> fila = new ArrayBlockingQueue<>(10);
        Object lock = new Object();

        Produtor produtor1 = new Produtor(fila, lock);
        Consumidor consumidor1 = new Consumidor(fila, lock);
        Produtor produtor2 = new Produtor(fila, lock);
        Consumidor consumidor2 = new Consumidor(fila, lock);
        Produtor produtor3 = new Produtor(fila, lock);
        Consumidor consumidor3 = new Consumidor(fila, lock);

        Thread pThread1 = new Thread(produtor1);
        Thread cThread1 = new Thread(consumidor1);
        Thread pThread2 = new Thread(produtor2);
        Thread cThread2 = new Thread(consumidor2);
        Thread pThread3 = new Thread(produtor3);
        Thread cThread3 = new Thread(consumidor3);

        pThread1.start();
        cThread1.start();
        pThread2.start();
        cThread2.start();
        pThread3.start();
        cThread3.start();
    }
}
