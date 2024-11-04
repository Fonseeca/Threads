package Atividade04;

import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static void main(String[] args){
        AtomicInteger contador = new AtomicInteger();

        Contador primeiro = new Contador(contador);
        Contador segundo = new Contador(contador);
        Contador terceiro = new Contador(contador);
        Contador quarto = new Contador(contador);
        Contador quinto = new Contador(contador);
        
        Thread Thread1 = new Thread(primeiro);
        Thread Thread2 = new Thread(segundo);
        Thread Thread3 = new Thread(terceiro);
        Thread Thread4 = new Thread(quarto);
        Thread Thread5 = new Thread(quinto);

        Thread1.start();
        Thread2.start();
        Thread3.start();
        Thread4.start();
        Thread5.start();

        try {
            Thread1.join();
            Thread2.join();
            Thread3.join();
            Thread4.join();
            Thread5.join();
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }

        System.out.println("O valor final contabilizado foi: " + contador.get());
    }
}
