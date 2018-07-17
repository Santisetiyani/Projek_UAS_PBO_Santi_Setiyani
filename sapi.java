package com.fti.santi;
import Jenis;
public class sapi extends Hewan implements Jenis{
    String name;
    public sapi(String name){
        super(4);
        this.name=name;
    }
    public sapi(){
        this("sapi ");
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
        System.out.println(name+" suka menari ");
    }
    @Override
    public void eat(){
        System.out.println(name+"suka makan rumput");
    }
}

