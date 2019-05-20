package com.example.humanoop;

import android.util.Log;

public class Human {

    private String name;
    private int age;
    private int weight;
    private int hour;

    public Human(String name, int age, int weight,int hour){
        this.name= name;
        this.age= age;
        this.weight= weight;
        this.hour= hour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }


    public void eat(){
        Log.d("Human", "im eating food");
    }

    public void sleep(){
        Log.d("Human", "zzzzzzzzz");
    }

    public int hour (int hours){
        hour=hour+ hours;
        return hours;


    }

    public void speak(){
        Log.d("Human", "im very bored with life ");
    }
    public int birthday(int addAge){
       age= age+addAge;
       return age;
    }
}
