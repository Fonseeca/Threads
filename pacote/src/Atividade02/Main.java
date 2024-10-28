package Atividade02;

public class Main {
    public static void main(String[] args){
        Pares par = new Pares();
        Ímpares ímpar = new Ímpares();

        Thread threadPar = new Thread(par);
        Thread threadÍmpar = new Thread(ímpar);

        threadPar.start();
        threadÍmpar.start();
    }
}
