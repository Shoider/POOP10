/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.poop10;

/**
 *
 * @author Brandon Hernandez Solis
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("######Arreglos######");
        try{
            String mensajes[]={"Mensaje uno","Mensaje dos","Mensaje tres"};
        for(int i=0;i<=3;i++){
            System.out.println(mensajes[i]);
            }
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Error: apuntador fuera de rango");
            System.out.println(e);
        }finally{
            System.out.println("A pesar de todo se ejecuta el bloque fynally");
        }
        System.out.println("######Aritmetica######");
        try{
            Integer denominador = null;
            float equis = 5/denominador;
            System.out.println(equis);
        }catch(ArithmeticException e){
            System.out.println("Error: "+e.getMessage());
        }catch(NullPointerException e){
            System.out.println("Error: "+e.getMessage());
        }catch(Exception e){
            System.out.println("Error: "+e.getMessage());
        }
        System.out.println("######Propagacion######");
        try{
            int division=division(10,0);
            System.out.println(division);
        }catch(ArithmeticException e){
            System.out.println("Error: "+e.getMessage());
        }
        System.out.println("######Propagacion 2######");
        int div2 = division2(4,0);
        System.out.println(div2);
        System.out.println("######throw-throws######");
        try{
            int div3 = division3(6,0);
            System.out.println(div3);
        }catch(ArithmeticException e){
            System.out.println("Error: Division entre cero");
        }
        System.out.println("######Crear Nuevas Excepciones######");
        Cuenta miCuenta = new Cuenta();
        try{
            miCuenta.depositar(2000);
            miCuenta.consultaSaldo();
            miCuenta.retirar(1500);
            miCuenta.consultaSaldo();
            miCuenta.retirar(650);
            miCuenta.consultaSaldo();
        }catch(MaximoDeRetirosException e){
            System.out.println("Error "+e.getMessage());
        }catch(SaldoInsuficienteException e){
            System.out.println("Error "+e.getMessage());
        }catch(DepositoMaximoExcedidoException e){
            System.out.println("Error "+e.getMessage());
        }
        System.out.println("######Actividad Extra 1######");
        try{
            miCuenta.depositar(25000);
            miCuenta.consultaSaldo();
        }catch(DepositoMaximoExcedidoException e){
            System.out.println("Error "+e.getMessage());
        }
        System.out.println("######Actividad Extra 2######");
        try{miCuenta.depositar(20000);
            miCuenta.consultaSaldo();
            miCuenta.retirar(1500);
            miCuenta.retirar(2500);
            miCuenta.retirar(3500);
            miCuenta.retirar(4500);
            miCuenta.retirar(5500);
        }catch(MaximoDeRetirosException | SaldoInsuficienteException | DepositoMaximoExcedidoException e){
            System.out.println("Error "+e.getMessage());
        }
    }
    private static int division(int a, int b){
        int c = a/b;
        return c;
    }
    
    private static int division2(int a, int b){
        int c=0;
        try{
            c = a/b;
        }catch(ArithmeticException e){
            System.out.println("Error: "+e.getMessage());
        }
        return c;
    }

    private static int division3(int a, int b) throws ArithmeticException{
        if(b==0){
            throw new ArithmeticException();
        }
        int c = a/b;
        return c;
    }
}