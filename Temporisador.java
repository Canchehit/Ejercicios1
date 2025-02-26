/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.temporisador;

/**
 *
 * @author luisa
 */
public class Temporisador {
    
    private int tiempoActual;
    private  Alarma alarma;
    
    public Temporisador (int tiempoActual ){
    this.tiempoActual = 0;
    }
    public void setAlarma (Alarma alarma){
    this.alarma = alarma;
    }
    public void iniciar (int duracion){
    System.out.println("Temporizador iniciado");
    for(int i = 0; i <= duracion;i++){
    tiempoActual = i;
     System.out.println("Tiempo actual: " + tiempoActual + " segundos");
    }
    if (alarma != null && tiempoActual == alarma.getTiempoObjetivo()) {
                alarma.activar();
            }
    try {
                Thread.sleep(1000);  // Espera 1 segundo
            } catch (InterruptedException e) {
                System.out.println("Temporizador interrumpido.");
            }
        }
 public class Main {
    public static void main(String[] args) {
        Temporizador temporizador = new Temporizador();
        Alarma alarma = new Alarma(5); 

        temporizador.setAlarma(alarma);
        temporizador.iniciar(10); 
    }
}
    }
    
    

