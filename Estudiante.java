/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.estudiante;

/**
 *
 * @author luisa
 */
public class Estudiante {
 
   private String nombre;
   private String carnet;
   private int nota1;
   private int nota2;
   private int nota3;
   private int notaFinal;

    private Estudiante(String jonathan, String string, int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public void Estudiante (String nomnre,String carnet,int notaFinal ){
    this.nombre = nombre;
    this.carnet = carnet;
    this.notaFinal = notaFinal;
    
    }
    
    public void getnombre(){
    this.nombre = nombre;
    }
    public void getcarnet(){
    this.carnet = carnet;
    }
    public void getnotaFinal(){
    this.notaFinal = notaFinal;
    }
    
    public int calcularPromedio(){
     return nota1+nota2+nota3;
    
    
    }
    public void setnotaFinal(){
    if(notaFinal < 0 || notaFinal > 100){   
    }
    this.notaFinal = notaFinal;
    }
    
    public boolean aprovo(){
    return notaFinal >= 61;
    }
        public static void main(String[] args) {
        
   Estudiante estudiante1 = new Estudiante("Jonathan","7590-25-871",72);
   Estudiante estudiante2 = new Estudiante("Maria","7590-25-971",63);
   Estudiante estudiante3 = new Estudiante("Jorge","7590-25-771",80);
  

       
    System.out.println("Promedio del curso: " + estudiante1.calcularPromedio());
    System.out.println("Promedio del curso: " + estudiante2.calcularPromedio());
    System.out.println("Promedio del curso: " + estudiante3.calcularPromedio());    
        }
}
