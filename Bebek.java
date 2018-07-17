package com.fti.santi;
import Jenis;

public class Bebek extends Hewan implements Jenis{
    String name;
    public Bebek(String name){
        super(0);
        this.name=name;
    }
    public Bebek(){
        this(" ");
    }
    @Override
    public String getName(){
        return name;
    }
    @Override
    public void setName(String name){
        this.name=name;
    }
    @Override
    public void play(){
        System.out.println("Suara bebek wek wek wek");
    }
    @Override
    public void eat(){
        System.out.println("Bebek bisa terbang tapi terbangnya rendah");
    }
    @Override
    public void walk(){
        System.out.println("Bebek goreng enak banget rasanya");
    }
}
