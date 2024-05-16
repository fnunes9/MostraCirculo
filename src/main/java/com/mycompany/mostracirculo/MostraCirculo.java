/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mostracirculo;

/**
 *
 * @author fernanda.nunes
 */
public class MostraCirculo {

    public static void main(String[] args) {
        Circulo circulo = new Circulo(10);
        VerificaCirculo.CalculaArea(circulo);
        VerificaCirculo.CalculaPerimetro(circulo);
        circulo.toString();
    }

}
