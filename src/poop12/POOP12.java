/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop12;

/**
 * Practica numero 12 POO en java
 * @author poo01alu01
 */
public class POOP12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*new HiloT("Primer hilo").start();
        new HiloT("Segundo hilo").start();
        
        new Thread(new HiloR(),"Tercer hilo").start();
        new Thread(new HiloR(),"Cuarto hilo").start();*/
        

        Cuenta deposito1 = new Cuenta("Deposito 1");
        Cuenta retiro1 = new Cuenta("Retiro 1");
        Cuenta deposito2 = new Cuenta("Deposito 2");
        Cuenta retiro2 = new Cuenta("Retiro 2");
        int i = 0;
        deposito1.start();
        retiro1.start();
        deposito2.start();
        retiro2.start();
                
        
    }
    
}
