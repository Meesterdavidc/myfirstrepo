package com.animal;

    public class Animal {
    //Variables or fields: this is the state of the class

    //public is accessible anywhere in te project
    public String name;

    //protected is accessible within the same package
    // as well as the subclasses of this class
    protected int age;

    // default, does not require an access modifier
    // to be invoked
    boolean Housepet;

    // private is accessible only within the same class
    private String owner;


    // after declaring our variable, we can then declare our constructors

    //No args constructor: no input in the parameters
    public Animal(){

    }


    public Animal(String name, int age, boolean Housepet,String owner){

        this.name=name;
        this.age=age;
        this.Housepet=Housepet;
        this.owner=owner;

    }


    //All args constructors have all the class parameters

    public Animal(String name){

   this.name=name;
    }
    // Methods are considered the behaviors of the class

        public String getOwner() {
            return owner;
        }

        protected void setOwner(String owner) {
            this.owner = owner;
            System.out.println("We are executing the logic from our super class");
        }
        String sayYourName(){
        return"";
        }
    }
