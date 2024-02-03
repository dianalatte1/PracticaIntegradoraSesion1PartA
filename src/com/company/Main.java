package com.company;

public class Main {

    public static void main(String[] args) {
//        Declaring an array of strings
        String cities[] = {"Londres", "Madrid", "Nueva York", "Buenos Aires", "Asunción", "São Paulo", "Lima", "Santiado de Chile", "Lisboa", "Tokio"};
//        Declaring a matrix of 2X2
        int temperaturas[][] = {{2, 33}, {-3, 32}, {-8, 27}, {4, 37}, {6, 42}, {5, 43}, {0, 39}, {-7, 26}, {-1, 31}, {-10, 36}};

        int tempMax = Integer.MIN_VALUE;
        int tempMin = Integer.MAX_VALUE;
        int indexMax = 0;
        int indexMin = 0;


        for (int i = 0; i < temperaturas.length; i++) {
            int t1 = 0;
            int t2 = 0;

            t1 = temperaturas[i][0];
            t2 = temperaturas[i][1];

            if (tempMax < t2) {
                tempMax = t2;
                indexMax = i;
            }

            if (tempMin > t1) {
                tempMin = t1;
                indexMin = i;
            }

        }
        System.out.println("Ciudad: " + cities[indexMin] + ", Temperatura miníma: " + tempMin);
        System.out.println("Ciudad: " + cities[indexMax] + ", Temperatura máxima: " + tempMax);


    }
}
