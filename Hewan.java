package com.fti.santi;

public abstract class Hewan {
    protected int legs; 
    protected Hewan(int legs){
        this.legs=legs;
    }
    public abstract void eat();
    public void walk(){
        System.out.println("Hewan berjalan dengan"+legs+"kaki");
    }
}
