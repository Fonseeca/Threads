package Atividade02;

public class Pares implements Runnable{
    @Override
    public void run(){
        int par = 0;

        while (true){
            try{
                long tempoDeEspera =  (long) (Math.random() * 1000);

                Thread.sleep(tempoDeEspera);

                System.out.println(par);

                par += 2;
            } catch (InterruptedException e){
                System.out.println("Falha no sistema!");
            }
        }
    }
}
