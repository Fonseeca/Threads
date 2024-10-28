package Atividade01;

public class Main {
    public static void main(String[] args){
        Implementa primeiraThread = new Implementa();

        Thread primeira = new Thread(primeiraThread);
        primeira.start();
    }
}