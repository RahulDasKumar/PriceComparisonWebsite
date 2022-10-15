package com.example.demo;

import java.util.ArrayList;

public class Algorithms {
    public static int indexOfSmallest(ArrayList<Double> array){


        if (array.size() == 0)
            return -1;

        int index = 0;
        double min = array.get(index);

        for (int i = 1; i < array.size(); i++){
            if (array.get(i) <= min){
                min = array.get(i);
                index = i;
            }
        }
        return index;
    }
}
