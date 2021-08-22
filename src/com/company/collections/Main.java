package com.company.collections;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        CustomArrayList<Integer> customArrayList = new CustomArrayList<>();

        customArrayList.add(10);
        customArrayList.add(20);
        customArrayList.add(30);
        customArrayList.add(40);

        for (int i = 0; i < customArrayList.size(); i++){
            System.out.println(customArrayList.get(i));
        }

        customArrayList.remove(1);
        System.out.println();

        for (int i = 0; i < customArrayList.size(); i++){
            System.out.println(customArrayList.get(i));
        }
    }
}
