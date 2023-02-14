package org.example;

public class Main {
    public static void main(String[] args) {
        float result= add(1,4);
        System.out.println(result);
        result = sub(1,4);
        System.out.println(result);
        result = mul(1,4);
        System.out.println(result);
        result = div(1,4);
        System.out.println(result);
        double dresult = log(4);
        System.out.println(dresult);
    }

    public static float add(float a, float b){
        return a+b;
    }

    public static float sub(float a, float b){
        return a-b;
    }

    public static float mul(float a, float b){
        return a*b;
    }

    public static float div(float a, float b){
        return a/b;
    }

    public static double log(float a){
        return Math.log(a);
    }
}