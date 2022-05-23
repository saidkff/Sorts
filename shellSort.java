package com.company;

import java.util.Random;

public class shellSort {
    public static void fillArray(int[] array){
        Random rand = new Random();
        for (int i=0; i<array.length; i++){
            array[i] = 10 + rand.nextInt(90);
        }
    }

    public static void showArray(int[] array){
        for (int i=0; i<array.length; i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }

    public static void shellSort(int[] array){
        int i, j, step;
        for (step = array.length/2; step>0; step/=2){
            for (i = step; i<array.length; i++){
                int ttemp = array[i];
                for (j=i; j>=step; j-=step){
                    if (ttemp<array[j-step]){
                        array[j] = array[j-step];
                    }
                    else{
                        break;
                    }
                }
                array[j] = ttemp;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("YAHOO! ");
        int[] array = new int[10];
        fillArray(array);
        showArray(array);
        shellSort(array);
        showArray(array);
    }
}
