/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.lucidchard.clase;

import ec.edu.espoch.lucidchard.Enumeraciones.TipoPlaneta;

/**
 *
 * @author SO-LAB1-PC24
 */
public class Planetas {

    public String nombre;
    public int cantSatelites;
    public double volumen;
    public double masaKilogramo;
    public double diametroKilometro;
    public double distanciaSol;
    public double densidadPlaneta;
    public TipoPlaneta TipoPlaneta;
    public boolean exterior=false;
    
    public Planetas(){
    
} 

    public Planetas(String nombre, int cantSatelites, double volumen, double masaKilogramo, double diametroKilometro, double distanciaSol, double densidadPlaneta, TipoPlaneta TipoPlaneta) {
        this.nombre = nombre;
        this.cantSatelites = cantSatelites;
        this.volumen = volumen;
        this.masaKilogramo = masaKilogramo;
        this.diametroKilometro = diametroKilometro;
        this.distanciaSol = distanciaSol;
        this.densidadPlaneta = densidadPlaneta;
        this.TipoPlaneta = TipoPlaneta;
    }

    
    
    public void imprimir() {
        System.out.println("Nombre" + nombre);
        System.out.println("Cantidad de Satelites" + cantSatelites);
        System.out.println("Volumen" + volumen);
        System.out.println("Masa en Kilogramos" + masaKilogramo);
        System.out.println("Diametro en Kilogramos" + diametroKilometro);
        System.out.println("Distancia del Sol" + distanciaSol);
        System.out.println("Tipo de Planeta" + TipoPlaneta.Enano);
    }

    public double calcularDensidadPlanetas() {
        return masaKilogramo / volumen;
    }

    public boolean exterior() {
        double max=3.4;
        double distan=14597870;
        double limit=max*distan;
        boolean respuesta=false;
        
        if (distanciaSol>limit);
            exterior=true;
            return false;
    }
}


