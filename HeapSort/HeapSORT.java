package com.company;

public class HeapSORT {
    private int[] array;
    private int heapSize;

    public HeapSORT(){
        array = null;
        heapSize = 0;
    }

    private void add(int el){
        int ttemp[] = new int[++heapSize];
        for (int i=0; i<heapSize-1; i++){
            ttemp[i] = array[i];
        }
        ttemp[heapSize-1] = el;
        array = ttemp;
    }

    public void push(int el){
        int i = heapSize;
        int parent = (i-1)/2;
        add(el);
        while(i>0 && parent>=0){
            if (array[i]>array[parent]){
                int ttemp = array[i];
                array[i] = array[parent];
                array[parent] = ttemp;
            }
            i = parent;
            parent = (i-1)/2;
        }
    }

    public void showArray(){
        for(int i=0; i<array.length; i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }

    public int getMax(){
        int ttemp = array[0];
        array[0] = array[heapSize-1];
        array[heapSize-1] = ttemp;

        int[] ttmp = new int[--heapSize];

        for (int i=0; i<heapSize; i++){
            ttmp[i] = array[i];
        }

        array = ttmp;

        Heapity(0);

        return ttemp;
    }

    public void Heapity(int i){
        int largest = i;
        int left = i*2+1;
        int right = i*2+2;
        if (left<heapSize && array[largest]<array[left]){
            largest = left;
        }
        if (right<heapSize && array[largest]<array[right]){
            largest = right;
        }
        if (i!=largest){
            int ttemp = array[largest];
            array[largest] = array[i];
            array[i] = ttemp;
            Heapity(largest);
        }
    }

    public void heapSort(){
        for (int i = heapSize-1; i>=0; i--){
            int ttemp = array[i];
            array[i] = array[0];
            array[0] = ttemp;
            heapSize--;
            Heapity(0);
        }
    }

}
