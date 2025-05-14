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
    
    public double getHP() {
        return hp;
    }
    
    public void setHp(double hp) {
        this.hp = hp;
    }
    
    public double getAtk() {
        return atk;
    }
    
    public void setAtk(double atk) {
        this.atk = atk;
    }
    
    public double getSp() {
        return sp;
    }
    
    public void setSp(double sp) {
        this.sp = sp;
    }
   
    public abstract void Check(); //Used to check character stats, and give a description of the character
    
    public void Fight() {
        System.out.println(name + "puts up a fight!");
    } 
    
    public void TearApart() {
        System.out.println(name + "tears you apart!");
    } 
}
