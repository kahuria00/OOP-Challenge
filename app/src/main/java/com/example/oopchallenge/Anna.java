package com.example.oopchallenge;

import android.util.Log;

public class Anna extends Human {
    private int height;

    public Anna(String name, int age, int weight, int height) {
        super(name, age, weight);
        this.height = height;
    }

    public Anna(String name, int age, int weight) {
        super(name, age, weight);


    }

    @Override
    public void eat() {
        super.eat();
        weight=weight+2;
        Log.d("Anna","I am eating I am now"+weight+"Kgs"
        );
    }

    @Override
    public int birthday() {

        age=age+4;
        Log.d("Anna","Its Your birthday, You are now"+age+ "years old");
        return  age;

        //return super.birthday(years);
    }
}
