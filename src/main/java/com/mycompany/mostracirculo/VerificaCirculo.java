/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mostracirculo;

/**
 *
 * @author fernanda.nunes
 */
public class VerificaCirculo {

    public static void CalculaArea(Circulo circulo) {
        circulo.SetArea(Math.PI * (Math.pow(circulo.GetRaio(), 2)));
    }

    public static void CalculaPerimetro(Circulo circulo) {
        circulo.SetPerimetro(circulo.GetRaio() * 2 * Math.PI);
    }
}
