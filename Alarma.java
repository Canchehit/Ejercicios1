/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.temporisador;

/**
 *
 * @author luisa
 */
public class Alarma {
     private int tiempoObjetivo; // Tiempo en segundos para activar la alarma

    // Constructor
    public Alarma(int tiempoObjetivo) {
        this.tiempoObjetivo = tiempoObjetivo;
    }

    // Método para obtener el tiempo objetivo
    public int getTiempoObjetivo() {
        return tiempoObjetivo;
    }

    // Método para activar la alarma
    public void activar() {
        System.out.println("¡Alarma activada! Tiempo alcanzado: " + tiempoObjetivo + " segundos.");
    }
}
    

