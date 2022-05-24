package com.company;

public class Main_HEAPSORT {
    public static void main(String[] args) {
        HeapSORT hps = new HeapSORT();
        for (int i=0; i<10; i++){
            hps.push((int) (Math.random()*100 + 1));
        }
        hps.showArray();
        hps.heapSort();
        hps.showArray();
    }
}
