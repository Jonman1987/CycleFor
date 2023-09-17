package org.example;

public class Main {

    public static boolean multipleFour(int member) {
        if (member % 4 == 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int start = 1;
        int stop = 100;

        int i;
        for (i = stop; i > start; i--) {
            if (multipleFour(i) == true) {
                System.out.println(i + " ");
            }
        }
    }
}