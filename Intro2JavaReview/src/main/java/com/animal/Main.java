package com.animal;

import com.WildAnimals.Lion;

public class Main {
    public static void main(String[] args) {


  Animal animal= new Animal("Billy");


        System.out.println(animal.name);

        Animal AllArgsConstructor= new Animal("Terry",9,true,"Dennis");


        Lion usingSuperOnlyLion= new Lion("Lion",4);
        System.out.println(usingSuperOnlyLion.age);


    }

}
