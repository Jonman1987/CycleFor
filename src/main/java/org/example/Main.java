package org.example;
public class Main {

    public static boolean multipleFour(int member) {
        return member % 4 == 0;
    }

    public static void main(String[] args) {
        int start = 1;
        int stop = 100;

        int i;
        for (i = stop; i > start; i--) {
            if (multipleFour(i)) {
                System.out.println(i + " ");
            }
        }
    }
}