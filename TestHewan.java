package com.fti.santi;
public class TestHewan {
    public static void main (String[] args){
        Bebek f =  new Bebek();
        sapi c = new sapi("santi");
        Hewan a= new Bebek();
        Hewan e= new sapi();
//        Jenis j= new sapi();
        //Demonstrate different implementations of an interface
        f.play();
        c.play();
        //Demonstract virtual method invocation
        e.eat();
        e.walk();
        //Demonstrate calling super methods
        a.walk();
    }
}