package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// 1
        int[] celoe = {1, 2, 3};
        double[] drob = {1.57, 7.654, 9.986};
        int[] massiv = {48, 32, 76, 86, 98};

    //2
        System.out.println(Arrays.toString(celoe));
        System.out.println(Arrays.toString(drob));
        System.out.println(Arrays.toString(massiv));

    //3

        for (int c = celoe.length - 1; c>= 0; c--) {
            if (c==0) {
                System.out.println(celoe[c]);
            } else {
                System.out.println(celoe[c] + ",");
            }
        }
        for (int c = drob.length - 1; c>=0; c--) {
            if (c==0) {
                System.out.println(drob[c]);
            } else {
                System.out.println(drob[c] + ",");
            }
        }
        for (int c = massiv.length - 1; c>=0; c--) {
            if (c==0) {
                System.out.println(massiv[c]);
            } else {
                System.out.println(massiv[c] + ",");
            }
        }
    //4
        int[] array = {1, 2, 3};
        for (int i = array.length % 1; i++) {
        if (i==0) {
            System.out.println(array[i]);
        }
    }
}
