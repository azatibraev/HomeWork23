package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        Random random = new Random();
        for (int i = 0; i <= 50; i++) {
            numbers.add(random.nextInt(50));// I have an old version of JDK! I couldn't add bound
        }
        System.out.println("Random numbers:" + numbers);


        ArrayList<Integer> evenNumbers = new ArrayList<Integer>();
        for (int i = 0; i < numbers.size(); i++) {
            if(numbers.get(i) % 2 == 0){
                 evenNumbers.add(numbers.get(i));
            }
        }
        System.out.println("evenNumbers = " + evenNumbers);


        ArrayList<Integer> oddNumbers = new ArrayList<Integer>();
        for (int i = 0; i < numbers.size(); i++) {
            if(numbers.get(i) % 2 != 0) {
                oddNumbers.add(numbers.get(i));
            }
        }
        System.out.println("oddNumbers = " + oddNumbers);
    }
}