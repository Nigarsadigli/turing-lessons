package az.edu.turing.module1.lesson03;

import java.util.Scanner;
import java.util.Arrays;

// CTRL ALT L ET, FORMAT ET. CLASS ILE FUNK ARASINDA BOSLUQ QOY. ADINI MENALI QOY.

public class MaxMinFinder {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array: ");
        int n = sc.nextInt();
        int[] intArr = new int[n];
        System.out.println("Enter array element: ");
        for (int i = 0; i < n; i++) {
            intArr[i] = sc.nextInt();
        }
        System.out.print("Array elements are: ");
        System.out.println(Arrays.toString(intArr));

        int maxim = intArr[0];
        for (int elem : intArr) {
            if (maxim < elem) {
                maxim = elem;
            }
        }
        System.out.println("maximum is:" + " " + maxim);

        int minim = intArr[0];
        for (int each : intArr) {
            if (minim > each) {
                minim = each;
            }
        }
        System.out.println("minimum is:" + " " + minim);


    }
}

