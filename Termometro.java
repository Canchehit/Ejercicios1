/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.termometro;

/**
 *
 * @author luisa
 */
public class Termometro {
    
   private int temperatura;
   private int convertirAFahrenheit;
   private int convertirAKelvin;  
   
    public void Termometro (int temperatura,int convertirAFahrenheit,int convertirAKelvin){
    this.temperatura = temperatura;
    this.convertirAFahrenheit = convertirAFahrenheit;
    this.convertirAKelvin = convertirAKelvin;
    }

   public void obtener (){
    this.temperatura = temperatura;
   
   }
   public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }
        
    public double getTemperatura() {
        return temperatura;
    }

    
    public double convertirAFahrenheit() {
        return (temperatura * 9 / 5) + 32;
    }

    // Método para convertir a Kelvin
    public double convertirAKelvin() {
        return temperatura + 273.15;
    }
    public void establecerTemperatura (){
    System.out.println("Temperatura celcius: " + temperatura);
        System.out.println("Temperatura Faherenheit: " + convertirAFahrenheit);
        System.out.println("Temperatura Kelvin:"+convertirAKelvin);
    }
    public static void main(String[] args) {
        
        Termometro ternometro1 = new Termometro();
        ternometro1.establecerTemperatura();
        
        
    }
    
}
