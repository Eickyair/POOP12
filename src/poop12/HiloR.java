/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop12;

/**
 * Paralelizacion con hilos en java
 * @author poo01alu01
 */
public class HiloR implements Runnable{
    /**
     * Sobreescritura del metodo run
     */
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Iteracion "+(i+1)+" de "+Thread.currentThread().getName());
            
        }
        System.out.println("Terimina el "+Thread.currentThread().getName());
    }
    
}
