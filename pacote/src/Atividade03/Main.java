package Atividade03;

public class Main {
    public static void main(String[] args){
        Object lock = new Object();
        Pares par = new Pares(lock);
        Ímpares ímpar = new Ímpares(lock);

        Thread threadPar = new Thread(par);
        Thread threadÍmpar = new Thread(ímpar);

        threadPar.start();
        threadÍmpar.start();
    }
}
