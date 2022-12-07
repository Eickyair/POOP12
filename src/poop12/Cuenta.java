/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop12;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Hilos para la manipulacion de una cuenta
 * @author Anvil
 */
public class Cuenta extends Thread{
    /**
     * Es estatico para que todos puedan
     * compartir la variable los hilos
     */
    private static double saldo;
    private static int mov = 0;
    /**
     * Hilo de cuenta
     * @param name Identificador del hilo
     */
    public Cuenta(String name) {
        super(name);
        saldo = 0d;
    }

    public static double getSaldo() {
        return saldo;
    }
    /**
     * Metodo para depositar dinero
     * @param monto cantidad a sumar
     */
    public synchronized void depositar(double monto){
        saldo+=monto;
        System.out.println(getName()+"... Saldo: $:"+saldo);
        notifyAll();
    }
    /**
     * Metodo para retirar dinero
     * @param monto cantidad a retirar
     */
    public synchronized void retirarDinero(double monto){
        if(monto>saldo){
            System.out.println(getName()+" debe esperar un deposito Saldo: "+saldo);
            try {
                sleep(50);
            } catch (InterruptedException ex) {
                System.out.println(ex.getMessage());
            }
        }
        if(monto > saldo){
            
            System.out.println("No se pudo hacer el retiro,no llego un deposito a tiempo");
            return;
        }
        saldo-=monto;
        System.out.println(getName()+" extrajo la cantidad $"+monto+", Saldo: "+saldo);
        notifyAll();
   }
   /**
    * Operaciones a realiazar
    */ 
   public synchronized void op(){
       if(mov == 50){
           notifyAll();
           stop();
           return;
       }
       else if(getName().equals("Deposito 1") || getName().equals("Deposito 2")){
            this.depositar(100);
        }else{
            this.retirarDinero(5);
        }
      mov+=1;
      notifyAll();
   }
    @Override
    public void run(){
        while(mov < 50){
            op();
        }
    } 
}
