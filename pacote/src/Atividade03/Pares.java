package Atividade03;

public class Pares implements Runnable {
    @Override
    synchronized public void run(boolean parEstáExecutando){
        boolean horaDoPar;
        int par = 0;


        if(parEstáExecutando == false){
            horaDoPar = true;
            notify();
            return;
        }


        parEstáExecutando = true;
        notify();

        try{
            while (parEstáExecutando){
                System.out.println(par);
                par += 2;

                wait();
            }
        } catch (InterruptedException e){
            System.out.println("Erro no sistema!");
        }
    }
}
