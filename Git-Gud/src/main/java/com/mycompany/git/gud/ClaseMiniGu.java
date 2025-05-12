/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.git.gud;

/**
 *
 * @author hazky
 */
public class ClaseMiniGu {
    
    private String nombre;
    private int edad;
    private String nacionalidad;
    
    public ClaseMiniGu(String nombre, int edad, String nacionalidad) {
        this.nombre = nombre;
        this.edad = edad;
        this.nacionalidad = nacionalidad;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public int getEdad() {
        return edad;
    }
    
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public String getNacionalidad() {
        return nacionalidad;
    }
    
    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
    
    
    public void vocear() {
        System.out.println("SUKII ! !");
    }
    
    //This is comment should appear in git...
    public void KillingMov() {
        System.out.println("Sukii rips your face off.");
    }
    
    
    
}
