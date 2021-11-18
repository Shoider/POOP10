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
public class Cuenta {
    //Atributos
    private double saldo;
    private int cont=1;
    //Constructor
    public Cuenta() {
        saldo = 0;
    }
    //Metodos
    public void depositar(double monto) throws DepositoMaximoExcedidoException{
        System.out.println("Depositando $"+monto);
        if(monto>20000)
            throw new DepositoMaximoExcedidoException();
        saldo+=monto;
    }
    public void retirar(double monto) throws SaldoInsuficienteException, MaximoDeRetirosException{
        System.out.println("Retirando $"+monto);
        if(saldo<monto)
            throw new SaldoInsuficienteException();
        if(cont>3)
            throw new MaximoDeRetirosException();
        saldo-=monto;
        cont+=1;
    }
    public void consultaSaldo(){
        System.out.println(saldo);
    }
}