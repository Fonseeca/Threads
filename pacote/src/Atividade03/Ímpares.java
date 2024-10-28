package Atividade03;

public class Ímpares implements Runnable {
    @Override
    synchronized public void run(boolean ímparEstáExecutando){
        boolean horaDoÍmpar;
        int ímpar = 1;


        if(ímparEstáExecutando == false){
            horaDoÍmpar = true;
            notify();
            return;
        }


        ímparEstáExecutando = true;
        notify();

        try{
            while (ímparEstáExecutando){
                System.out.println(ímpar);
                ímpar += 2;

                wait();
            }
        } catch (InterruptedException e){
            System.out.println("Erro no sistema!");
        }
    }
}
