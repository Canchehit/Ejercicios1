/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cuentabancaria;

/**
 *
 * @author luisa
 */
public class CuentaBancaria {

    
        private int numeroCuenta;
        private int saldoInicial;
        private String nombreUsuario;
      
        public CuentaBancaria(int numeroCuenta,int saldoInicial,String nombreUsuario){
        this.numeroCuenta = numeroCuenta;
        this.saldoInicial = saldoInicial;
        this.nombreUsuario = nombreUsuario;
        }
        public void deposito (){
            if(saldoInicial > 0){
            }else
                System.out.println("El saldo debe de ser mayor a 0");
        }
        
        public void retiro (){
            if(saldoInicial > 0){
            }else
                System.out.println("El saldo debe de ser mayor a 0");
        }
        
        public void consultarSaldo (){
            if(saldoInicial > 0){
            }else
                System.out.println("El saldo debe de ser mayor a 0");
        }
        public void mostrarInformacion() {
        System.out.println("Numero de tu cuenta: " + numeroCuenta);
        System.out.println("Saldo: " + saldoInicial);
        System.out.println("Nombre:"+nombreUsuario);
}
        public static void main(String[] args) {
            
      CuentaBancaria cuenta1 = new CuentaBancaria(456,100,"lUIS");
      cuenta1.mostrarInformacion();
}   
} 
