package com.WildAnimals;

import com.animal.Animal;

public class Lion extends Animal {

    //this class has no variables of its own

    // no args constructor
    public Lion(){

    }
    public Lion(String name, int age) {
        super.age = age;
        super.name = name;
        //super.Housepet: we do not have access to the default or private fields
        //of the parents classes when we are in a separate package.

    }

    @Override
    public String getOwner() {
        return "I am overriding the method from my parent class";
    }

    @Override
    protected void setOwner(String owner) {
        super.setOwner(owner);
    }
}
