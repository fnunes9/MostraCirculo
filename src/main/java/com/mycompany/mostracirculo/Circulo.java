/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mostracirculo;

public class Circulo {

    double raio, area, perimetro;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double GetRaio() {
        return raio;
    }

    public void SetArea(double NovaArea) {
        area = NovaArea;
    }

    public void SetPerimetro(double Novoperimetro) {
        perimetro = Novoperimetro;
    }

    @Override
    public String toString() {
        return "Raio: " + raio + " Área: " + area + "Perímetro: " + perimetro;
    }
}
