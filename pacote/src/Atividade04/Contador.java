package Atividade04;

import java.util.concurrent.atomic.AtomicInteger;

public class Contador implements Runnable{
    final int quantidade;
    AtomicInteger contador;

    public Contador(AtomicInteger contador){
        this.quantidade = 100000;
        this.contador = contador;
    }

    public void run(){
        int i = 0;
        while(i < quantidade){
            incrementar();
            i++;
        }
        System.out.println("A Thread " + contador.get()/100000 + " terminou de incrementar");
    }

    public synchronized void incrementar(){
        contador.incrementAndGet();
    }
}
