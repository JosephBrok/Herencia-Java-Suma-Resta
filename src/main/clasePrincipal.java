/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import operaciones.ClaseHija_Resta;
import operaciones.ClaseHija_Suma;

/**
 *
 * @author José Ignacio Pérez Luis
 */
public class clasePrincipal {
    public static void main(String[] args) {
        ClaseHija_Suma suma = new ClaseHija_Suma();
        suma.pedirDatos();
        suma.suma();
        System.out.println("El resultado de la suma es: ");
        suma.muestraResultado();
        
        ClaseHija_Resta resta= new ClaseHija_Resta();
        resta.pedirDatos();
        resta.resta();
        System.out.println("El resultado de la resta es: ");
        resta.muestraResultado();
    }
}
