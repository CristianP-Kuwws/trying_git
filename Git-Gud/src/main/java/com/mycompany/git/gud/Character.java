/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.git.gud;

/**
 *
 * @author hazky
 */
public abstract class Character {
    
    private String name;
    private double hp;
    private double atk;
    private double sp;
    
    public Character(String name, double hp, double atk, double sp) {
        this.name = name;
        this.hp = hp;
        this.atk = atk;
        this.sp = sp;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
}
