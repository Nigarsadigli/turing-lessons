package az.edu.turing.module1.lesson03;
import java.util.Scanner;
import java.util.Arrays;

public class MovieApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of an array: ");
        int n = sc.nextInt();

        int[] intArr1 = new int[n]; // Corrected initialization

        System.out.println("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            intArr1[i] = sc.nextInt();
        }

        System.out.println("Array elements are: " + Arrays.toString(intArr1));

        int maxim = intArr1[0];
        for (int elem : intArr1) {
            if (maxim < elem) {
                maxim = elem;
            }
        }

        System.out.println("Maximum is:" + " " + maxim);

        int minim= intArr1[0];
        for (int each: intArr1){
            if (minim>each){
                minim=each;
            }
        }
        System.out.println("Minimum is:" + " " + minim);
    }

}

