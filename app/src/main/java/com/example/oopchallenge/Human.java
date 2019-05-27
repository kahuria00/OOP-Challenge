package com.example.oopchallenge;

import android.util.Log;

public class Human {
    public String name;
    public int age;
    public int weight;

    public Human(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
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

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void eat(){
        Log.d("Human","I am eating");
    }

    public void sleep (){
        Log.d("Human","ZZZZZZZZZZZZZ");
    }
    public int sleep(int hours){
        Log.d("Human","I am sleeping for " +hours +"hours");
        return hours;
    }
    public int birthday(){
        age=age+1;
        Log.d("Human","Happy Birthday you are "+ age+"years old");
        return age;
    }

    public void speak( String speech){
        Log.d("Human","You are speaking");
    }
}
