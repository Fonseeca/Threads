package Atividade02;

public class Ímpares implements Runnable {
    @Override
    public void run(){
        int ímpar = 1;

        while (true){
            try{
                long tempoDeEspera =  (long) (Math.random() * 1000);

                Thread.sleep(tempoDeEspera);

                System.out.println(ímpar);

                ímpar += 2;
            } catch (InterruptedException e){
                System.out.println("Falha no sistema!");
            }
        }
    }
}
