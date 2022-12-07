/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop12;

/**
 * Paralelizacion con hilos en java
 * @author poo01alu01
 */
public class HiloT extends Thread{
    /**
     * Constructor
     * @param name identificador del hilo
     */
    public HiloT(String name) {
        super(name);
    }
    public void run(){
        for(int i = 0;i<5;i++){
            System.out.println("Iteracion "+(i+1)+" de " + getName());
        }
        System.out.println("Termina el hilo "+getName());
    }
}
