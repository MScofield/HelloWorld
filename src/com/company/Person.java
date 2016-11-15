package com.company;

/**
 * Created by scofieldservices on 11/14/16.
 * in-class exercise on constructors, getters & setters.
 */


public class Person {

    private String name;
    private int age;
    private boolean isAlive;

    public Person() {
        name = "Kyle";
    }

public String getName(){
    return name;
}
public void setName(String n){
        if(isValidName(n)){
        name = n;}}


public static boolean isValidName (String name){}

public int getAge() {
    return age;
}

public void setAge(int a) {
    {if (a > 0)
    age = a;
}}

public boolean alive() {
    return isAlive;
}

public void setAlive(boolean alive){
    isAlive = alive;
}