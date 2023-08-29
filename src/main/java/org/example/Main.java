package org.example;

public class Main {

    public static int multipleFour(int member) {
        if (member % 4 == 0) {
            return member;
        }
        return 0;
    }

    public static void main(String[] args) {
        int start = 1;
        int stop = 100;

        int iterator;
        for (iterator = stop; iterator > start; iterator--) {
            if (multipleFour(iterator) != 0) {
                System.out.println(iterator + " ");
            }
        }
    }
}